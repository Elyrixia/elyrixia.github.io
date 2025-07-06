package io.elyrixia.resume

import com.raquo.laminar.api.L.{*, given}
import io.elyrixia.resume.elements.navigation.Navigation
import io.elyrixia.resume.elements.sections
import org.scalajs.dom

@main
def Main(): Unit = {

  render(
    dom.document.getElementById("page-top"),
    Navigation.htmlElement
  )

  render(
    dom.document.getElementById("page-top"),
    sections.htmlElement
  )

}
