package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLElement

private[sections] object Skills {

  private final case class Icon(
      name: String,
      size: Icon.Size = Icon.Size.Normal
  ) {
    val toLowerCase: String = name.toLowerCase
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
    className := "list-inline-item",
    i(img(src := s"/icons/${icon.toLowerCase}.png", alt := icon.name, className := icon.size.name))
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
      p(className    := "mb-0", softSkillDescription)
    )
  }

  private def softSkillList(softSkills: (String, String)*) = ul(
    className := "fa-ul mb-0",
    softSkills.map(softSkill)
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "skills",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", "skills"),
      //
      h3(className  := "mb-3", "Technical"),
      div(className := "subheading mb-3", "Strong Professional Experience"),
      iconList("Scala", "Akka", Icon("AWS", Icon.Size.Small), "Redis", "Kafka"),
      div(className := "subheading mb-3", "Professional Experience"),
      iconList("Java", "Go", "Typescript", "Bash"),
      div(className := "subheading mb-3", "Personal Experience"),
      iconList("Rust", "Kotlin", "Python", "Ruby"),
      //
      h3(className := "mb-3", "Organisational"),
      softSkillList(
        (
          "Architecture design",
          "Defined scopes, analyzed costs and impacts, selected the best solutions, defined rollout plans"
        ),
        (
          "Knowledge sharing",
          "Lead knowledge sharing organizations at work, spoke at conferences, wrote articles, taught at schools"
        ),
        (
          "Leading projects and teams",
          "Lead multiple cross teams projects, managed temporarily small and medium teams"
        )
      )
    )
  )

}
