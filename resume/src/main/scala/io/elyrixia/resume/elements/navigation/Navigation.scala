package io.elyrixia.resume.elements.navigation

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.codecs.StringAsIsCodec
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.elements.common.ProfilePic
import io.elyrixia.resume.localization.{Language, Localization}
import org.scalajs.dom.HTMLElement

object Navigation {

  private def section(nameKey: String) = li(
    className := "nav-item",
    a(
      className := "nav-link js-scroll-trigger active",
      href      := s"#${nameKey.split('.').last}",
      child.text <-- Localization.text(nameKey)
    )
  )

  private def languageButton(language: Language) = button(
    className := "btn btn-link p-1 ms-2",
    title     := language.name,
    onClick --> { _ => Localization.setLanguage(language) },
    span(
      className := "fs-5",
      language.flagEmoji
    )
  )

  private val languageButtons = div(
    className := "language-buttons d-flex align-items-center ms-auto",
    Language.all.map(languageButton)
  )

  private val sections = List(
    section("nav.about"),
    section("nav.experience"),
    section("nav.skills"),
    section("nav.education"),
    section("nav.references")
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = navTag(
    className := "navbar navbar-expand-lg navbar-dark bg-primary fixed-top",
    idAttr    := "sideNav",
    a(
      className := "navbar-brand js-scroll-trigger",
      href      := "#page-top",
      span(
        className := "d-block d-lg-none",
        "Tristan Sallé"
      ),
      span(
        className := "d-none d-lg-block",
        ProfilePic.htmlElement
      )
    ),
    button(
      className                                   := "navbar-toggler",
      typ                                         := "button",
      htmlAttr("data-bs-toggle", StringAsIsCodec) := "collapse",
      htmlAttr("data-bs-target", StringAsIsCodec) := "#navbarResponsive",
      htmlAttr("aria-controls", StringAsIsCodec)  := "navbarResponsive",
      htmlAttr("aria-expanded", StringAsIsCodec)  := "false",
      htmlAttr("aria-label", StringAsIsCodec)     := "Toggle navigation",
      span(className := "navbar-toggler-icon")
    ),
    div(
      className := "collapse navbar-collapse",
      idAttr    := "navbarResponsive",
      ul(
        className := "navbar-nav",
        sections,
        languageButtons
      )
    )
  )

}
