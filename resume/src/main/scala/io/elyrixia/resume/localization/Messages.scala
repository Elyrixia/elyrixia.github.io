package io.elyrixia.resume.localization

object Messages {

  private final case class LocalizedText(english: String, french: String)
  private given localizedTextConversion: Conversion[(String, String), LocalizedText] =
    (english, french) => LocalizedText(english = english, french = french)
  private given simpleTextConversion: Conversion[String, LocalizedText] =
    english => LocalizedText(english = english, french = english)

  private val messages: Map[String, LocalizedText] = Map(
    // Navigation
    "nav.about"      -> ("About", "À propos"),
    "nav.experience" -> ("Experience", "Expérience"),
    "nav.skills"     -> ("Skills", "Compétences"),
    "nav.education"  -> ("Education", "Éducation"),
    "nav.references" -> ("References", "Références"),

    // About Section
    "about.title"    -> ("About", "À propos"),
    "about.location" -> ("French · 30600 Vauvert France", "Français · 30600 Vauvert France"),
    "about.description.1" -> (
      "I am an experienced backend engineer with a strong background in SRE, DevOps and Infrastructure related topics.",
      "Je suis un ingénieur backend expérimenté avec une solide expérience en SRE, DevOps et sujets liés à l'Infrastructure."
    ),
    "about.description.2" -> (
      "I am passionate about building robust, scalable systems, from implementing complex business features to putting in place the right infrastructure for the use case.",
      "Je suis passionné par la construction de systèmes robustes et évolutifs, de l'implémentation de fonctionnalités métier complexes à la mise en place de l'infrastructure répondant au mieux au problème."
    ),
    "about.description.3" -> (
      "I'm currently best familiar with the JVM ecosystem and especially the Scala language but I am used to working with a wide range of different technologies and programming languages to fill the needs of each project I lead or contribute to.",
      "L'écosystème JVM et particulièrement le langage Scala sont actuellement l'environnement de code dans lequel j'ai le plus d'affinité, mais j'ai l'habitude de travailler avec une large gamme de technologies et de langages de programmation différents pour répondre aux besoins de chaque projet que je dirige ou auquel je contribue."
    ),

    // Experience Section
    "experience.title"             -> ("Experience", "Expérience"),
    "experience.job.1.title"       -> "Staff Engineer",
    "experience.job.1.company"     -> "Teads - SSP Video Team",
    "experience.job.1.timeline"    -> ("January 2025 - Present", "Janvier 2025 - Présent"),
    "experience.job.1.description" -> "desc1",
    "experience.job.2.title"       -> "Senior Software Engineer",
    "experience.job.2.company"     -> "Teads - SSP Scaling Team",
    "experience.job.2.timeline"    -> ("April 2023 - January 2025", "Avril 2023 - Janvier 2025"),
    "experience.job.2.description" -> "desc2",
    "experience.job.3.title"       -> "Senior Software Engineer",
    "experience.job.3.company"     -> "Teads - Infrastructure Reliability Team",
    "experience.job.3.timeline"    -> ("January 2023 - April 2023", "Janvier 2023 - Avril 2023"),
    "experience.job.3.description" -> "desc3",
    "experience.job.4.title"       -> "Senior Software Engineer",
    "experience.job.4.company"     -> "Teads - SSP Scaling Team",
    "experience.job.4.timeline"    -> ("January 2021 - January 2023", "Janvier 2021 - Janvier 2023"),
    "experience.job.4.description" -> "desc4",
    "experience.job.5.title"       -> "Senior Software Engineer",
    "experience.job.5.company"     -> "Teads - SSP Team",
    "experience.job.5.timeline"    -> ("January 2019 - January 2021", "Janvier 2019 - Janvier 2021"),
    "experience.job.5.description" -> "desc5",
    "experience.job.6.title"       -> "Software Engineer",
    "experience.job.6.company"     -> "Teads - SSP Team",
    "experience.job.6.timeline"    -> ("September 2015 - January 2019", "Septembre 2015 - Janvier 2019"),
    "experience.job.6.description" -> "desc6",

    // Skills Section
    "skills.title"                   -> ("Skills", "Compétences"),
    "skills.technical"               -> ("Technical", "Technique"),
    "skills.organizational"          -> ("Organisational", "Organisationnelle"),
    "skills.strong.experience"       -> ("Strong Professional Experience", "Forte Expérience Professionnelle"),
    "skills.professional.experience" -> ("Professional Experience", "Expérience Professionnelle"),
    "skills.experience"              -> ("Personal Experience", "Expérience Personnelle"),
    "skills.soft.architecture.title" -> ("Architecture design", "Conception d'architecture"),
    "skills.soft.architecture.description" -> (
      "Define scopes, analyze costs and impacts, select the best solutions, define rollout plans with timeline estimations",
      "Définir les scopes, analyser les coûts et impacts, sélectionner les meilleures solutions, définir les plans de déploiement avec estimations de délais"
    ),
    "skills.soft.ownership.title" -> ("Business and Technical ownership", "Maîtrise métier et technique"),
    "skills.soft.ownership.description" -> (
      "Used to work on complex business features and large-scale technical challenges",
      "Habitué à travailler sur des fonctionnalités métier complexes et des défis techniques à grande échelle"
    ),
    "skills.soft.leadership.title" -> ("Lead projects and teams", "Gestion de projets et équipes"),
    "skills.soft.leadership.description" -> (
      "Lead cross-teams and complex projects, manage small and medium teams temporarily",
      "Diriger des projets inter-équipes et complexes, gérer temporairement des petites et moyennes équipes"
    ),
    "skills.soft.mentoring.title" -> ("Mentoring and Knowledge sharing", "Mentorat et partage de connaissances"),
    "skills.soft.mentoring.description" -> (
      "Lead knowledge sharing community, organize events at work, put in place an onboarding process, participate in hiring, taught at schools",
      "Diriger une communauté de partage de connaissances, organiser des événements au travail, mettre en place un processus d'onboarding, participe au recrutement, a enseigné dans des écoles"
    ),
    "skills.soft.communication.title" -> (
      "Communication and branding",
      "Communication et mis en avant de son entreprise"
    ),
    "skills.soft.communication.description" -> (
      "Give talks at public conferences, write articles, lead external events",
      "Réalise des présentations lors de conférences publiques, écrit des articles, dirige des événements externes"
    ),

    // Education Section
    "education.title"             -> ("Education", "Éducation"),
    "education.degree.1.title"    -> ("Engineering Degree - Computer Science", "Diplôme d'Ingénieur - Informatique"),
    "education.degree.1.school"   -> "Polytech - Montpellier",
    "education.degree.1.timeline" -> "2012 - 2015",
    "education.degree.2.title" -> (
      "University Diploma of Technology - Computer Science",
      "Diplôme Universitaire de Technologie - Informatique"
    ),
    "education.degree.2.school"   -> "IUT - Montpellier",
    "education.degree.2.timeline" -> "2010 - 2012",
    "education.degree.3.title" -> (
      "Bachelor's degree - Science specializing in Mathematics",
      "Baccalauréat - Sciences spé Mathématiques"
    ),
    "education.degree.3.school"   -> "Lycée Henri IV - Béziers",
    "education.degree.3.timeline" -> "2010",

    // References Section
    "references.title"     -> ("References", "Références"),
    "references.available" -> ("TODO", "TODO")
  )

  def get(key: String, language: Language): String = {
    messages.get(key) match {
      case Some(localized) =>
        language match {
          case Language.English => localized.english
          case Language.French  => localized.french
        }
      case None => s"Missing translation: $key"
    }
  }

}
