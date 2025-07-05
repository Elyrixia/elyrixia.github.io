package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLElement

private[sections] object About {

  private val description = div(
    className := "lead mb-5",
    p(
      "I am an experienced backend engineer with a strong background in site reliability engineering," +
        " devOps and infrastructure related topics."
    ),
    p(
      " I am passionate about building robust, scalable systems, from implementing complex business features" +
        " to putting in place the right matching infrastructure."
    ),
    p(
      " I'm currently best familiar with the JVM ecosystem and especially the Scala language but I am used to" +
        " working with a wide range of technologies and programming languages to fill the needs of each project" +
        " I lead or contribute to."
    )
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
    className := "col-auto",
    img(
      className := "img-fluid img-profile rounded-circle mx-auto mb-2",
      className := "logo",
      alt       := "my profile pic",
      src       := "/logo-color.webp"
    )
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
        "30600 Vauvert · France · ",
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
