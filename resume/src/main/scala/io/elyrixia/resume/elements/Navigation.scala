package io.elyrixia.resume.elements

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.codecs.StringAsIsCodec
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.elements.common.ProfilePic
import org.scalajs.dom.HTMLElement

object Navigation {

  private def section(name: String) = li(
    className := "nav-item",
    a(
      className := "nav-link js-scroll-trigger active",
      href      := s"#${name.toLowerCase}",
      name
    )
  )

  private val sections = List(
    section("About"),
    section("Experience"),
    section("Skills"),
    section("Education"),
    section("References")
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
        sections
      )
    )
  )

}
