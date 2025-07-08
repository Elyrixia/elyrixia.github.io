package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.elements.common.ProfilePic
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

private[sections] object About {

  private val description = div(
    className := "lead",
    p(className := "mb-5", child.text <-- Localization.text("about.description.1")),
    p(className := "mb-5", child.text <-- Localization.text("about.description.2")),
    p(className := "mb-5", child.text <-- Localization.text("about.description.3"))
  )

  private def icon(name: String, link: String): ReactiveHtmlElement[HTMLElement] = {
    a(
      href      := link,
      className := "social-icon",
      i(
        className := s"fa fa-brands fa-$name"
      )
    )
  }

  private val profilePic = div(
    className := "col-auto d-lg-none",
    ProfilePic.htmlElement
  )

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "about",
    div(
      className := "resume-section-content",
      div(
        className := "row align-items-center mb-4",
        profilePic,
        div(
          className := "col",
          h1(
            className := "mb-0",
            "Tristan ",
            span(
              className := "text-primary",
              "Sallé"
            )
          )
        )
      ),
      div(
        className := "subheading mb-5",
        child.text <-- Localization.text("about.location"),
        " · ",
        a(
          href := "mailto:salle.trist@gmail.com",
          "salle.trist@gmail.com"
        )
      ),
      description,
      div(
        className := "social-icons",
        List(
          icon("github", "https://github.com/Elyrixia"),
          icon("bluesky", "https://bsky.app/profile/tristanseko.bsky.social")
        )
      )
    )
  )

}
