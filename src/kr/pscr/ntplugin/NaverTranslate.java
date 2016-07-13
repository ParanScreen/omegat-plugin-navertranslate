package kr.pscr.ntplugin;

/**
 * Created by nano on 2016. 7. 12..
 */

import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import org.omegat.core.machinetranslators.BaseTranslate;
import kr.pscr.ntplugin.NTPostResponse;
import org.omegat.util.Language;
import org.omegat.util.WikiGet;
import org.omegat.util.Log;
import org.json.*;

/*
 * Naver Translate plugin for OmegaT
 * based on Yandex Translate plugin by oisee https://sourceforge.net/projects/NaverTranslatepluginforomegat/
 * licensed under GNU GPLv2 and modified by ParanScreen
 */


@SuppressWarnings({"unchecked", "rawtypes"})
public class NaverTranslate extends BaseTranslate {

    public static final int ERR_OK = 200;
    public static final int ERR_AUTH_FAILED = 401;
    public static final int ERR_ERR = 403;
    public static final int ERR_SERVER_ERROR = 500;

    protected static final String USER_AGENT = "Mozilla/5.0";

    protected static final String GT_URL = "https://openapi.naver.com/v1/language/translate";

    protected static Map<String, String> translationCache = new HashMap<String, String>();

    protected static String mvNaverKey = System.getProperty("naver.api.key");
    protected static String mvNaverSecret = System.getProperty("naver.api.secret");

    @Override
    protected String getPreferenceName() {
        return "allow_naver_translate";
    }
    //POST  -   https://openapi.naver.com/v1/language/translate     JSON

    public String getName() {
        if (mvNaverKey == null || mvNaverSecret == null) {
            return "Naver Translate(Client Key/Secret Required)";
        } else {
            return "Naver Translate";
        }
    }

    @Override
    protected String translate(Language sLang, Language tLang, String text) throws Exception {
        if (mvNaverKey == null) {
            return "";
        }
        //languages supported: (ko:한국어, en:영어, ja:일본어, zh-CN:중국어(간체))
        String lvSourceLang = sLang.getLanguageCode().substring(0, 2).toLowerCase();
        String lvTargetLang = tLang.getLanguageCode().substring(0, 2).toLowerCase();
        String result = "";

        if(lvTargetLang.equals("zh")) lvTargetLang = "zh-CN";

        String lvShorText = text.length() > 10000 ? text.substring(0, 9999) + "…" : text;
        String lvCacheText = lvSourceLang + '-' + lvTargetLang + lvShorText;
        String lvCachedResult = translationCache.get(lvCacheText);
        if (lvCachedResult != null) {
            return lvCachedResult;
        }


        Map<String, String> parms = new TreeMap<String, String>();
        parms.put("source", lvSourceLang);
        parms.put("target", lvTargetLang);
        parms.put("text", lvShorText);

        Map<String, String> headers = new TreeMap<String, String>();
        headers.put("X-Naver-Client-Id", mvNaverKey);
        headers.put("X-Naver-Client-Secret", mvNaverSecret);

        NTPostResponse response = requestTranslate(parms, headers);
        //Log.log(response.response.toString());

        switch(response.code){
            case ERR_OK:
                JSONObject msgJson = new JSONObject(response.response);
                Log.log(msgJson.toString());
                result = msgJson.getJSONObject("message").getJSONObject("result").getString("translatedText");
                break;

            case ERR_AUTH_FAILED:
                return "An Error Occurred: Authorization Failed.";

            case ERR_SERVER_ERROR:
                return "An Error Occurred: Server Error.";

            case ERR_ERR:
                return "Ann Error Occured: Unknown Error.";

            default:
                Log.log("Naver Translate - Error: " + response.response);
                return "An Error Occurred: " + response.response;
        }

        translationCache.put(lvCacheText, result);
        return result;
    }

    protected NTPostResponse requestTranslate(Map params, Map headers) throws Exception {
        NTPostResponse response = new NTPostResponse();
        try {
            response.response = WikiGet.post(GT_URL, params, headers);
            response.code = ERR_OK;
        } catch (WikiGet.ResponseError ex) {
            response.response = ex.message;
            response.code = ex.code;
        }
        return response;
    }
}

