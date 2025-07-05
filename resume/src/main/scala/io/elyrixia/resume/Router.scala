package io.elyrixia.resume

import com.raquo.waypoint.*
import upickle.default.*

object Router {

  sealed abstract class Page(val title: String)
  object Page {
    case object Home extends Page("Elyrixia - Home")
    given rwHome: ReadWriter[Home.type] = macroRW

    case object Test extends Page("Elyrixia - Test")
    given rwTest: ReadWriter[Test.type] = macroRW
  }

  given rw: ReadWriter[Page] = macroRW

  private val homeRoute = Route.static(Page.Home, root / endOfSegments)
  private val testRoute = Route.static(Page.Test, root / "test" / endOfSegments)

  object instance
      extends Router[Page](
        routes = List(homeRoute, testRoute),
        getPageTitle = page =>
          page.title, // (document title, displayed in the browser history, and in the tab next to favicon)
        serializePage = page => write(page),       // serialize page data for storage in History API log
        deserializePage = pageStr => read(pageStr) // deserialize the above
      )

}
