package io.elyrixia.resume.elements.common

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLImageElement

object ProfilePic {

  // Use a def to generate a unique instance for each usage
  def htmlElement: ReactiveHtmlElement[HTMLImageElement] = img(
    className := "img-fluid img-profile rounded-circle mx-auto mb-2",
    className := "logo",
    alt       := "my profile pic",
    src       := "/logo-color.webp"
  )

}
