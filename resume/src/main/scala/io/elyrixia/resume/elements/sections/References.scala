package io.elyrixia.resume.elements.sections

import com.raquo.laminar.api.L.{*, given}
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.elyrixia.resume.localization.Localization
import org.scalajs.dom.HTMLElement

object References {

  private final case class Card(
      icon: String,
      link: String,
      title: String,
      description: String,
      padding: String = "mb-3"
  )

  private def card(card: Card) =
    div(
      className := s"card ${card.padding}",
      div(
        className := "card-body d-flex align-items-center gap-3",
        i(className := s"${card.icon} fs-4 text-primary"),
        a(
          className := "stretched-link text-decoration-none",
          href      := card.link,
          target    := "_blank",
          h5(className := "card-title mb-1", card.title),
          p(className  := "card-text", card.description)
        )
      )
    )

  private def cards(cards: Card*) =
    cards.map(card)

  val htmlElement: ReactiveHtmlElement[HTMLElement] = sectionTag(
    className := "resume-section",
    idAttr    := "references",
    div(
      className := "resume-section-content",
      h2(className := "mb-5", child.text <-- Localization.text("references.title")),
      cards(
        Card(
          icon = "fas fa-book-open",
          link = "https://medium.com/teads-engineering/the-caching-strategy-of-our-teads-ssp-b0e152e951d0",
          title = "The Caching Strategy of our Teads SSP",
          description = "How our distributed cache system around the SSP platform evolved during the past 10 years",
          padding = "mb-5"
        ),
        Card(
          icon = "fab fa-youtube",
          link = "https://www.youtube.com/watch?v=vyFHWS8rtDg",
          title = "Tu penses quoi de mon Scala ? Parlons code review !",
          description = "French recording of a talk I did at ScalaIO 2018"
        ),
        Card(
          icon = "fab fa-youtube",
          link = "https://www.youtube.com/watch?v=6YsEodUdnE0",
          title = "Kleisli, un ami qui vous veut du bien",
          description = "French recording of a talk I did at ScalaIO 2017 in pair with Xavier Bucchiotty",
          padding = "mb-5"
        ),
        Card(
          icon = "fab fa-github",
          link = "https://github.com/Elyrixia/conf-slides",
          title = "Slides",
          description = "Public talks I did in the past and some teaching material for courses I taught at schools"
        ),
        Card(
          icon = "fab fa-github",
          link = "https://github.com/Elyrixia/elyrixia.github.io",
          title = "Source code of this Resume",
          description = "Written in Scala.js+Laminar with the help of Cursor, feel free to take inspiration from it!"
        )
      )
    )
  )

}
