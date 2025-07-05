package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLElement

private[sections] object Experience {

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "experience",
    div(
      className := "resume-section-content",
      h2("Experience"),
      ul(
        li(
          className := "mb-5",
          h3("Software Engineer at Example Company"),
          p("Worked on various projects using Scala and JavaScript.")
        ),
        li(
          className := "mb-5",
          h3("Frontend Developer at Another Company"),
          p("Focused on building responsive web applications.")
        )
      )
    )
  )

}
