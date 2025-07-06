package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

private[sections] object Skills {

  private final case class Icon(
      name: String,
      size: Icon.Size = Icon.Size.Normal
  ) {
    val fileName: String = name.toLowerCase.replace(" ", "-")
  }

  private object Icon {
    sealed trait Size { def name: String }
    object Size {
      case object Normal extends Size {
        override def name: String = "icon"
      }
      case object Small extends Size {
        override def name: String = "icon-sm"
      }
    }
  }

  private given itemConversion: Conversion[String, Icon] = s => Icon(s)

  private def icon(icon: Icon) = li(
    className := "list-inline-item p-2",
    i(img(src := s"/icons/${icon.fileName}.png", title := icon.name, alt := icon.name, className := icon.size.name))
  )

  private def iconList(icons: Icon*) = ul(
    className := "list-inline dev-icons mb-4",
    icons.map(icon)
  )

  private def softSkill(titleKey: String, descriptionKey: String) = li(
    span(
      className := "fa-li",
      i(className := "fas fa-check")
    ),
    span(className := "subheading mb-3", child.text <-- Localization.text(titleKey)),
    p(className := "mb-3", child.text <-- Localization.text(descriptionKey))
  )

  private def softSkillList(softSkills: (String, String)*) = ul(
    className := "fa-ul",
    softSkills.map((title, description) => softSkill(title, description))
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "skills",
    div(
      className := "resume-section-content",
      h2(child.text <-- Localization.text("skills.title")),
      hr(className := "mb-3"),
      //
      h3(className := "mb-3", child.text <-- Localization.text("skills.technical")),
      ///
      div(className := "subheading mb-3", child.text <-- Localization.text("skills.strong.experience")),
      iconList(
        "Scala",
        "Akka",
        Icon("AWS", Icon.Size.Small),
        "Redis",
        "Kafka",
        "Terraform",
        "Docker",
        "Grafana",
        "Git",
        "MySQL",
        "ArgoCD"
      ),
      ///
      div(className := "subheading mb-3", child.text <-- Localization.text("skills.professional.experience")),
      iconList(
        "Java",
        "Scala-Cats",
        "Kubernetes",
        "Helm",
        "Bash",
        "GCP",
        "Spark",
        "Flink",
        "Cassandra",
        "Go",
        "Typescript",
        "Github Actions"
      ),
      ///
      div(className := "subheading mb-3", child.text <-- Localization.text("skills.experience")),
      iconList("Rust", "ZIO", "Kotlin", "Python", "MongoDB"),
      ///
      hr(className := "mb-3"),
      //
      h3(className := "mb-3", child.text <-- Localization.text("skills.organizational")),
      softSkillList(
        (
          "skills.soft.architecture.title",
          "skills.soft.architecture.description"
        ),
        (
          "skills.soft.ownership.title",
          "skills.soft.ownership.description"
        ),
        (
          "skills.soft.leadership.title",
          "skills.soft.leadership.description"
        ),
        (
          "skills.soft.mentoring.title",
          "skills.soft.mentoring.description"
        ),
        (
          "skills.soft.communication.title",
          "skills.soft.communication.description"
        )
      )
    )
  )

}
