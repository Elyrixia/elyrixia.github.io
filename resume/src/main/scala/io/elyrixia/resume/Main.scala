package io.elyrixia.resume

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

@main
def Main(): Unit = {

  def renderPage(page: Router.Page): Element = {
    page match {
      case Router.Page.Home =>
        div(
          button(
            Router.instance.navigateTo(Router.Page.Test),
            "Test"
          )
        )
      case Router.Page.Test =>
        div(
          button(
            Router.instance.navigateTo(Router.Page.Home),
            "Back to home"
          )
        )
    }
  }

  val app: Div = div(
    addressTag(
      Router.instance.navigateTo(Router.Page.Home),
      h1("Elyrixia's Resume")
    ),
    child <-- Router.instance.currentPageSignal.map(renderPage)
  )

  render(
    dom.document.getElementById("app"),
    app
  )

}
