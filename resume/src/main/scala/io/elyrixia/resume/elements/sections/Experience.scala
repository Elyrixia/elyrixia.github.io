package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLElement

private[sections] object Experience {

  private def experience(
      title: String,
      company: String,
      description: String,
      timeline: String
  ) = div(
    className := "d-flex flex-column flex-md-row justify-content-between mb-5",
    div(
      className := "flex-grow-1",
      h3(className  := "mb-0", title),
      div(className := "subheading mb-3", company),
      p(description)
    ),
    div(
      className := "flex-shrink-0",
      span(className := "text-primary", timeline)
    )
  )

  private val experiences = List(
    experience(
      "Staff Engineer",
      "Teads",
      "desc1",
      "January 2025 - Present"
    ),
    experience(
      "Senior Software Engineer",
      "Teads",
      "desc2",
      "January 2019 - January 2025"
    ),
    experience(
      "Software Engineer",
      "Teads",
      "desc3",
      "September 2015 - January 2019"
    )
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "experience",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", "Experience"),
      experiences
    )
  )

}
