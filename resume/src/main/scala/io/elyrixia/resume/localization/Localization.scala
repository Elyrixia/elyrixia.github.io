package io.elyrixia.resume.localization

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

object Localization {

  // I prefer to display english by default, so I'm not using this method,
  // but you can instantiate `languageVar` using it if you want to adapt the website's default language to the user.
  private def detectBrowserLanguage(): Language = {
    // Check if user has a stored preference
    Option(dom.window.localStorage.getItem("preferredLanguage"))
      .map(Language.fromCode)
      .getOrElse {
        // Fallback to browser language
        val browserLang = dom.window.navigator.language
        Language.fromCode(browserLang)
      }
  }

  // Reactive state for current language
  private val languageVar: Var[Language]        = Var(Language.English)
  private val currentLanguage: Signal[Language] = languageVar.signal

  def setLanguage(language: Language): Unit = {
    languageVar.set(language)
    // Store preference in localStorage
    dom.window.localStorage.setItem("preferredLanguage", language.code)
  }

  def text(key: String): Signal[String] = {
    currentLanguage.map { lang =>
      Messages.get(key, lang)
    }
  }

}
