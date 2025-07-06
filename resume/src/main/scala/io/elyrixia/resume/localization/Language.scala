package io.elyrixia.resume.localization

sealed trait Language(val code: String, val name: String, val flagEmoji: String)
object Language {
  case object English extends Language("en", "English", "🇺🇸")
  case object French  extends Language("fr", "Français", "🇫🇷")

  val all: List[Language] = List(English, French)

  def fromCode(code: String): Language = code.toLowerCase match {
    case "fr" | "fr-fr" | "fr-ca" => French
    case _                        => English
  }
}
