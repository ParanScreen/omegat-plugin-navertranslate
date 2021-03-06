# Naver Translate plug-in for OmegaT

##English
This plugin enables users to use machine translation provided by Naver, a South-Korean based portal site, in OmegaT CAT environment.
For now, Naver Translator supports 6(six) language pairs, including Korean to {English, Chinese, Japanese} and {English, Chinese, Japanese} to Korean.

This plug-in is based on [Yandex Translate Plugin for OmegaT](https://sourceforge.net/projects/yandextranslatepluginforomegat/) by [oisee](https://sourceforge.net/u/oisee/profile/) and Google Translate Plugin of OmegaT.
This software is open source software licensed under the GNU GPLv2. In addition, as a special exception, the copyright holders of this program give you permission to combine the program with free software programs or libraries that are released with code included in the standard release of [JSON-java Library](https://github.com/stleary/JSON-java) under the [JSON-java License](https://github.com/stleary/JSON-java/blob/master/LICENSE). You may copy and distribute such a system following the terms of the GNU GPL for this program and the licenses of the other code concerned. For detailed information, please refer to the LICENSE file.

###How to use
0. Issue your API key/secret from [NAVER Developers](https://developers.naver.com/register?defaultScope=translate) web site. (NAVER Account required)

####Apple macOS
1. Copy the plug-in file into /Applications/OmegaT.app/Contents/Java/plugins directory.
2. Open the file /Applications/OmegaT.app/Contents/Resources/Configuration.properties with text editor and add these lines:
```
naver.api.key=YOURAPIKEY
naver.api.key=YOURAPISECRET
```
3. Open OmegaT Application. From Options > Machine Translation, select Naver Translate.

####Microsoft Windows
1. Copy the plug-in file into %SystemDrive%\%ProgramFiles%\OmegaT\plugins directory.
2. Open the file %SystemDrive%\%ProgramFiles%\OmegaT\OmegaT.I4J.ini with text editor and add these lines:
```
-Dnaver.api.key=YOURAPIKEY -Dnaver.api.secret=YOURAPISECRET
```
3. Open OmegaT Application. From Options > Machine Translation, select Naver Translate.

####GNU/Linux

> **안내**
> Ubuntu 기본 레포지토리에는 OmegaT 구 버전(2.3.0.1)만이 업로드되어 있습니다.

1. Copy the plug-in file under the directory that OmegaT installed.
2. In case of running the program with command line prompt, add this parameter: ```-Dnaver.api.key=YOURAPIKEY -Dnaver.api.secret=YOURAPISECRET```
3. Open OmegaT Application. From Options > Machine Translation, select Naver Translate.

##한국어(Korean)
이 플러그인을 이용하면 네이버에서 제공하는 [네이버 번역기](http://translate.naver.com)의 기계 번역을 OmegaT에서 사용할 수 있게 됩니다.

현재, 네이버 번역기는 한국어에서 영어/중국어/일본어로, 영어/중국어/일본어에서 한국어로의, 총 6개 페어의 번역을 지원합니다.

이 플러그인은 [oisee](https://sourceforge.net/u/oisee/profile/)님의 [Yandex Translate Plugin for OmegaT](https://sourceforge.net/projects/yandextranslatepluginforomegat/)와, OmegaT에 기본 내장된 Google 번역 플러그인에 기반하여 작성되었습니다.
이 소프트웨어는 GNU GPLv2를 따르는 자유 소프트웨어입니다. 또한 특별한 예외사항으로, 본 프로그램의 저작권자는 이 프로그램을 [JSON-java License](https://github.com/stleary/JSON-java/blob/master/LICENSE) 하에 공개된 [JSON-java Library](https://github.com/stleary/JSON-java)의 표준 릴리즈에 포함된 코드와 결합하는 것을 허가합니다. 귀하는 이러한 시스템을 이 프로그램에 대한 GNU GPL의 조항과, 그 밖의 관계된 코드의 라이센스에 따라 복사하거나 배포할 수 있습니다. 자세한 내용을 열람하려면 LICENSE 파일을 참조해 주십시오.

###사용법
0. [NAVER Developers](https://developers.naver.com/register?defaultScope=translate) 웹 사이트에서 API 키/시크릿을 발급받습니다. (NAVER 계정 필요)

####Apple macOS
1. /Applications/OmegaT.app/Contents/Java/plugins 디렉토리에 플러그인 파일을 복사합니다. 
2. /Applications/OmegaT.app/Contents/Resources/Configuration.properties 파일을 텍스트 편집기로 열어 다음 구문을 추가한 뒤 저장합니다.
```
naver.api.key=여러분의API키
naver.api.key=여러분의API시크릿
```
3. OmegaT를 열고, 옵션 > 기계 번역에서 Naver Translate를 선택합니다.

####Microsoft Windows
1. %SystemDrive%\%ProgramFiles%\OmegaT\plugins 디렉토리에 플러그인 파일을 복사합니다.
2. %SystemDrive%\%ProgramFiles%\OmegaT\OmegaT.I4J.ini 파일을 열고, 다음 구문을 추가한 뒤 저장합니다.
```
-Dnaver.api.key=여러분의API키 -Dnaver.api.secret=여러분의API시크릿
```
3. OmegaT를 열고, 옵션 > 기계 번역에서 Naver Translate를 선택합니다.

####GNU/Linux

> **안내**
> Ubuntu 기본 레포지토리에는 OmegaT 구 버전(2.3.0.1)만이 업로드되어 있습니다.

1. OmegaT가 설치된 디렉토리 하위의 plugins 디렉토리에 플러그인 파일을 복사합니다.
2. 명령행으로 실행할 경우, ```-Dnaver.api.key=여러분의API키 -Dnaver.api.secret=여러분의API시크릿``` 파라미터를 추가합니다.
3. OmegaT를 열고, 옵션 > 기계 번역에서 Naver Translate를 선택합니다.


##日本語(Japanese)
このプラグインを利用して、韓国のポータルサイトであるネイバ（Naver)から提供する[NAVER機械翻訳機](http://translate.naver.com)をOmegaTから使用することができます。

NAVER機械翻訳機は、韓国語から英語・中国語（大陸簡体）・日本語及び、英語・中国語（大陸簡体）・日本語から韓国語の6個ペアをサポートします。

このプラグインは、[oisee](https://sourceforge.net/u/oisee/profile/)様の[Yandex Translate Plugin for OmegaT](https://sourceforge.net/projects/yandextranslatepluginforomegat/) と、OmegaTに内装されているGoogle Translateプラグインに基盤します。
このソフトウェアは、GNU GPLv2によって自由ソフトウェアとして配布されています。加えて、特別の例外として、このプログラムの著作権者は、このプログラムを、[JSON-java License](https://github.com/stleary/JSON-java/blob/master/LICENSE)の[JSON-java Library](https://github.com/stleary/JSON-java)の標準リリースに含まれるコードと結合することを許可します。貴下はそのようなシステムを、このプログラムに対するGNU GPLの条項と、その他の関係するコードのライセンスに従って、コピーし、配布することができます。詳しい情報については、LICENSEファイルを参考して下さい。


