package com.liskovsoft.smartyoutubetv2.common.vot;

public final class VotConfig {
    // Native Android port aligned with the tagged upstream releases.
    public static final String VOT_VERSION = "1.12.3";
    public static final String VOT_JS_VERSION = "3.2.0";
    public static final String HOST = "api.browser.yandex.ru";
    public static final String HMAC_KEY = "bt8xH3VOlb4mqf0nqAibnDOoiPlXsisf";
    public static final String USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) " +
            "Chrome/150.0.0.0 YaBrowser/26.8.0.0 Safari/537.36";
    public static final String COMPONENT_VERSION = "26.10.0.1796";
    public static final String REQUEST_LANG = "en";
    public static final String RESPONSE_LANG = "ru";
    public static final String FAKE_AUDIO_FILE_ID = "web_api_get_all_generating_urls_data_from_iframe";

    // Source languages Yandex video translation accepts (vot.js availableLangs)
    private static final String[] SOURCE_LANGS = {"en", "zh", "ko", "ar", "fr", "it", "es", "de", "ja"};

    public static boolean isSupportedSourceLang(String langCode) {
        if (langCode == null) {
            return true;
        }
        String base = langCode.toLowerCase(java.util.Locale.ROOT).split("[-_]", 2)[0];
        for (String lang : SOURCE_LANGS) {
            if (lang.equals(base)) {
                return true;
            }
        }
        return false;
    }

    private VotConfig() {
    }
}
