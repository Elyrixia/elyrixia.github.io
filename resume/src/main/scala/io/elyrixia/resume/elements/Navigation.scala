package io.elyrixia.resume.elements

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.codecs.StringAsIsCodec
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLElement

object Navigation {

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
        img(
          className := "img-fluid img-profile rounded-circle mx-auto mb-2",
          className := "logo",
          alt       := "my profile pic",
          src       := "/logo-color.webp"
        )
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
        li(
          className := "nav-item",
          a(
            className := "nav-link js-scroll-trigger active",
            href      := "#about",
            "About"
          )
        ),
        li(
          className := "nav-item",
          a(
            className := "nav-link js-scroll-trigger",
            href      := "#experience",
            "Experience"
          )
        )
      )
    )
  )

}
