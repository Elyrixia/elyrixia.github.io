package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
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

  private def softSkill(softSkill: (String, String)) = {
    val (softSkillTitle, softSkillDescription) = softSkill
    li(
      span(
        className := "fa-li",
        i(className := "fas fa-check")
      ),
      span(className := "subheading mb-3", softSkillTitle),
      p(className    := "mb-3", softSkillDescription)
    )
  }

  private def softSkillList(softSkills: (String, String)*) = ul(
    className := "fa-ul",
    softSkills.map(softSkill)
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "skills",
    div(
      className := "resume-section-content",
      h2("skills"),
      hr(className := "mb-3"),
      //
      h3(className := "mb-3", "Technical"),
      ///
      div(className := "subheading mb-3", "Strong Professional Experience"),
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
      div(className := "subheading mb-3", "Professional Experience"),
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
      div(className := "subheading mb-3", "Experience"),
      iconList("Rust", "ZIO", "Kotlin", "Python", "MongoDB"),
      ///
      hr(className := "mb-3"),
      //
      h3(className := "mb-3", "Organisational"),
      softSkillList(
        (
          "Architecture design",
          "Defined scopes, analyzed costs and impacts, selected the best solutions, defined rollout plans with" +
            " timeline estimations"
        ),
        (
          "Business and Technical ownership",
          "Used to work on complex business features and large-scale technical challenges"
        ),
        (
          "Lead projects and teams",
          "Lead multiple cross-teams and complex projects, managed small and medium teams for several months"
        ),
        (
          "Mentoring and Knowledge sharing",
          "Lead knowledge sharing groups and events at work, put in place an onboarding process, taught at schools," +
            " participated in hiring"
        ),
        (
          "Communication and branding",
          "Gave talks at public conferences, wrote articles, lead external events"
        )
      )
    )
  )

}
