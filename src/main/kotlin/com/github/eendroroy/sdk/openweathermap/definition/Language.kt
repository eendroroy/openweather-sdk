package com.github.eendroroy.sdk.openweathermap.definition

/**
 * @author indrajit
 */
enum class Language(private val value: String) {
    AFRIKAANS("af"),
    ALBANIAN("al"),
    ARABIC("ar"),
    AZERBAIJANI("az"),
    BULGARIAN("bg"),
    CATALAN("ca"),
    CHINESE_SIMPLIFIED("zh_cn"),
    CHINESE_TRADITIONAL("zh_tw"),
    CZECH("cz"),
    DANISH("da"),
    GERMAN("de"),
    GREEK("el"),
    ENGLISH("en"),
    BASQUE("eu"),
    PERSIAN("fa"),
    FARSI("fa"),
    FINNISH("fi"),
    FRENCH("fr"),
    GALICIAN("gl"),
    HEBREW("he"),
    HINDI("hi"),
    CROATIAN("hr"),
    HUNGARIAN("hu"),
    INDONESIAN("id"),
    ITALIAN("it"),
    JAPANESE("ja"),
    KOREAN("kr"),
    LATVIAN("la"),
    LITHUANIAN("lt"),
    MACEDONIAN("mk"),
    NORWEGIAN("no"),
    DUTCH("nl"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    PORTUGUESE_BRASIL("pt_br"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SWEDISH1("sv"),
    SWEDISH2("se"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SPANISH1("sp"),
    SPANISH2("es"),
    SERBIAN("sr"),
    THAI("th"),
    TURKISH("tr"),
    UKRAINIAN1("ua"),
    UKRAINIAN2("uk"),
    VIETNAMESE("vi"),
    ZULU("zu");

    override fun toString(): String {
        return value()
    }

    fun value(): String {
        return value
    }

}