package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

private[sections] object Experience {

  private def experience(
      titleKey: String,
      companyKey: String,
      descriptionKey: String,
      timelineKey: String
  ) = div(
    className := "d-flex flex-column flex-md-row justify-content-between mb-5",
    div(
      className := "flex-grow-1",
      h3(className := "mb-0", child.text <-- Localization.text(titleKey)),
      div(className := "subheading mb-3", child.text <-- Localization.text(companyKey)),
      p(child.text <-- Localization.text(descriptionKey))
    ),
    div(
      className := "flex-shrink-0",
      span(className := "text-primary", child.text <-- Localization.text(timelineKey))
    )
  )

  private val experiences = List(
    experience(
      "experience.job.1.title",
      "experience.job.1.company",
      "experience.job.1.description",
      "experience.job.1.timeline"
    ),
    experience(
      "experience.job.2.title",
      "experience.job.2.company",
      "experience.job.2.description",
      "experience.job.2.timeline"
    ),
    experience(
      "experience.job.3.title",
      "experience.job.3.company",
      "experience.job.3.description",
      "experience.job.3.timeline"
    ),
    experience(
      "experience.job.4.title",
      "experience.job.4.company",
      "experience.job.4.description",
      "experience.job.4.timeline"
    ),
    experience(
      "experience.job.5.title",
      "experience.job.5.company",
      "experience.job.5.description",
      "experience.job.5.timeline"
    ),
    experience(
      "experience.job.6.title",
      "experience.job.6.company",
      "experience.job.6.description",
      "experience.job.6.timeline"
    )
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "experience",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", child.text <-- Localization.text("experience.title")),
      experiences
    )
  )

}
