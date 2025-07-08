package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

private[sections] object Education {

  private def education(
      diplomaKey: String,
      schoolKey: String,
      timelineKey: String
  ) = div(
    className := "d-flex flex-column flex-md-row justify-content-between mb-5",
    div(
      className := "flex-grow-1",
      h3(className  := "mb-0", child.text <-- Localization.text(diplomaKey)),
      div(className := "subheading mb-3", child.text <-- Localization.text(schoolKey))
    ),
    div(
      className := "flex-shrink-0",
      span(className := "text-primary", child.text <-- Localization.text(timelineKey))
    )
  )

  private val educations = List(
    education(
      "education.degree.1.title",
      "education.degree.1.school",
      "education.degree.1.timeline"
    ),
    education(
      "education.degree.2.title",
      "education.degree.2.school",
      "education.degree.2.timeline"
    ),
    education(
      "education.degree.3.title",
      "education.degree.3.school",
      "education.degree.3.timeline"
    )
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "education",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", child.text <-- Localization.text("education.title")),
      educations
    )
  )

}
