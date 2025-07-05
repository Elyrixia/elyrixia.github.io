package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLElement

private[sections] object Education {

  private def education(
      diploma: String,
      school: String,
      timeline: String
  ) = div(
    className := "d-flex flex-column flex-md-row justify-content-between mb-5",
    div(
      className := "flex-grow-1",
      h3(className  := "mb-0", diploma),
      div(className := "subheading mb-3", school)
    ),
    div(
      className := "flex-shrink-0",
      span(className := "text-primary", timeline)
    )
  )

  private val educations = List(
    education(
      "Engineering Degree - Computer Science",
      "Polytech - Montpellier",
      "2012 - 2015"
    ),
    education(
      "University Diploma of Technology - Computer Science",
      "IUT - Montpellier",
      "2010 - 2012"
    ),
    education(
      "Bachelor's degree - Science specializing in Mathematics",
      "Lycée Henri IV - Béziers",
      "youth - 2010"
    )
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "education",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", "Education"),
      educations
    )
  )

}
