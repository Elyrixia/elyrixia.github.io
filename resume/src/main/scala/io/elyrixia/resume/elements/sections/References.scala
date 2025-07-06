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
      p(child.text <-- Localization.text("references.available"))
    )
  )

}
