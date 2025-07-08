package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

object References {

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "references",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", child.text <-- Localization.text("references.title")),
      ul(
        className := "fa-ul mb-4",
        li(
          className := "mb-3",
          span(
            className := "fa-li",
            i(className := "fas fa-link")
          ),
          a(
            className := "subheading",
            href      := "https://medium.com/teads-engineering/the-caching-strategy-of-our-teads-ssp-b0e152e951d0",
            "Medium Article - The Caching Strategy of our Teads SSP"
          )
        ),
        li(
          className := "mb-3",
          span(
            className := "fa-li",
            i(className := "fas fa-link")
          ),
          a(
            className := "subheading",
            href      := "https://github.com/Elyrixia/elyrixia.github.io",
            "Github Repository of this Resume - Feel free to take inspiration from it!"
          )
        ),
        li(
          className := "mb-3",
          span(
            className := "fa-li",
            i(className := "fas fa-link")
          ),
          a(
            className := "subheading",
            href      := "https://github.com/Elyrixia/conf-slides",
            "Slides for the public talks I made and some teaching material I gave to schools"
          )
        )
      )
    )
  )

}
