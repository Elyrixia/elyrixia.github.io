package io.elyrixia.resume.elements

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLDivElement

package object sections {

  private val separator = hr(className := "m-0")
  private val sections = List(
    About.htmlElement,
    Experience.htmlElement,
    Skills.htmlElement,
    Education.htmlElement,
    References.htmlElement
  )

  val htmlElement: ReactiveHtmlElement[HTMLDivElement] = div(
    className := "container-fluid p-0",
    sections.flatMap(Seq(_, separator)).dropRight(1)
  )

}
