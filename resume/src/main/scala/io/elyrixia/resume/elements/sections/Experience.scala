package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

private[sections] object Experience {

  private final case class Description(
      summary: String,
      tasks: List[String]
  )

  private def experience(
      titleKey: String,
      companyKey: String,
      timelineKey: String,
      description: Description
  ) = div(
    className := "d-flex flex-column flex-md-row justify-content-between mb-5",
    div(
      className := "flex-grow-1",
      h3(className  := "mb-0", child.text <-- Localization.text(titleKey)),
      div(className := "subheading mb-3", child.text <-- Localization.text(companyKey)),
      p(child.text <-- Localization.text(description.summary)),
      ul(
        className := "fa-ul",
        description.tasks.map(task =>
          li(
            span(className := "fa-li", i(className := "fas fa-check")),
            child.text <-- Localization.text(task)
          )
        )
      )
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
      "experience.job.1.timeline",
      Description(
        summary = "experience.job.1.description.summary",
        tasks = List(
          "experience.job.1.description.task.1",
          "experience.job.1.description.task.2"
        )
      )
    ),
    experience(
      "experience.job.2.title",
      "experience.job.2.company",
      "experience.job.2.timeline",
      Description(
        summary = "experience.job.2.description.summary",
        tasks = List(
          "experience.job.2.description.task.1",
          "experience.job.2.description.task.2",
          "experience.job.2.description.task.3"
        )
      )
    ),
    experience(
      "experience.job.3.title",
      "experience.job.3.company",
      "experience.job.3.timeline",
      Description(
        summary = "experience.job.3.description.summary",
        tasks = List(
          "experience.job.3.description.task.1",
          "experience.job.3.description.task.2"
        )
      )
    ),
    experience(
      "experience.job.4.title",
      "experience.job.4.company",
      "experience.job.4.timeline",
      Description(
        summary = "experience.job.4.description.summary",
        tasks = List(
          "experience.job.4.description.task.1",
          "experience.job.4.description.task.2",
          "experience.job.4.description.task.3"
        )
      )
    ),
    experience(
      "experience.job.5.title",
      "experience.job.5.company",
      "experience.job.5.timeline",
      Description(
        summary = "experience.job.5.description.summary",
        tasks = List(
          "experience.job.5.description.task.1",
          "experience.job.5.description.task.2",
          "experience.job.5.description.task.3"
        )
      )
    ),
    experience(
      "experience.job.6.title",
      "experience.job.6.company",
      "experience.job.6.timeline",
      Description(
        summary = "experience.job.6.description.summary",
        tasks = List(
          "experience.job.6.description.task.1",
          "experience.job.6.description.task.2",
          "experience.job.6.description.task.3",
          "experience.job.6.description.task.4"
        )
      )
    )
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "experience",
    div(
      className := "resume-section-content",
      h2(className := "mb-3", child.text <-- Localization.text("experience.title")),
      p(className  := "mb-5", child.text <-- Localization.text("experience.summary")),
      experiences
    )
  )

}
