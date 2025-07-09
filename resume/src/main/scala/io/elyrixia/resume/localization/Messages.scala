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
    "nav.title"      -> ("Tristan Sallé · Resume", "Tristan Sallé · CV"),

    // About Section
    "about.title"    -> ("About", "À propos"),
    "about.location" -> ("French · 30600 Vauvert France", "Français · 30600 Vauvert France"),
    "about.description.1" -> (
      "I am an experienced backend engineer with a strong background in SRE, DevOps and infrastructure related topics." +
        " I excel at building robust and scalable systems, from implementing complex business features to" +
        " putting in place the right infrastructure for each use case.",
      "Je suis un ingénieur backend expérimenté avec une solide expérience en SRE, DevOps et sujets liés à l'infrastructure." +
        " J'excelle dans la construction de systèmes robustes et évolutifs, de l'implémentation de fonctionnalités" +
        " métier complexes à la mise en place de l'infrastructure répondant au mieux à chaque problème."
    ),
    "about.description.2" -> (
      "I'm currently managing an ad delivery platform responsible for serving more than 200k requests per second with a" +
        " latency of less than 200ms on the p99, while processing 150+ complex business and technical rules for" +
        " each request.",
      "Je gère actuellement une plateforme publicitaire traitant plus de 200k requêtes par seconde avec" +
        " une latence inférieure à 200ms sur le p99, tout en gérant 150+ règles métier et techniques" +
        " complexes pour chaque requête."
    ),
    "about.description.3" -> (
      "I am best familiar with the JVM ecosystem and especially the Scala language but I am used to" +
        " working with a wide range of different technologies and programming languages to fill the needs of each" +
        " project I lead or contribute to.",
      "L'écosystème JVM et particulièrement le langage Scala représentent l'environnement dans lequel" +
        " j'ai le plus d'expérience, mais j'ai l'habitude de travailler avec une large gamme de technologies et" +
        " de langages de programmation différents pour répondre aux besoins de chaque projet que je dirige" +
        " ou auquel je contribue."
    ),

    // Experience Section
    "experience.title" -> ("Experience - WIP", "Expérience - WIP"),
    "experience.summary" -> (
      "This is a summary of the different roles I had while working at Teads for the past 10 years" +
        " and an extract of some topics I worked on during each period."
    ),
    //
    "experience.job.1.title"    -> "Staff Engineer",
    "experience.job.1.company"  -> "Teads - SSP Video Team",
    "experience.job.1.timeline" -> ("January 2025 - Present", "Janvier 2025 - Présent"),
    "experience.job.1.description.summary" -> (
      "Following a merge with the Outbrain company, I moved to a new team focused on managing our existing SSP platform" +
        " while integrating our two systems together and start homogenizing our solutions"
    ),
    "experience.job.1.description.task.1" -> (
      "Designed a refactoring plan to improve the entry points of the SSP platform in terms of performance and maintainability"
    ),
    "experience.job.1.description.task.2" -> (
      "Iterated on plugging our pipes together to deliver Teads demand on Outbrain supply and vice versa"
    ),
    //
    "experience.job.2.title"    -> "Senior Software Engineer",
    "experience.job.2.company"  -> "Teads - SSP Scaling Team",
    "experience.job.2.timeline" -> ("April 2023 - January 2025", "Avril 2023 - Janvier 2025"),
    "experience.job.2.description.summary" -> (
      "Moved back to the SSP Scaling team to keep working on the 'Feeder stack' (distributed caching) now running" +
        " on Kubernetes and making the developer experience as smooth as possible," +
        " while keeping scaling up the platform to handle more than 400k requests per second at peak"
    ),
    "experience.job.2.description.task.1" -> (
      "Put in place templating using Helm to make it easy for developers to bootstrap a new 'feeder job' and maintain it"
    ),
    "experience.job.2.description.task.2" -> (
      "Designed and lead a migration plan to move all our services at Teads from Akka to Pekko following a licensing change"
    ),
    "experience.job.2.description.task.3" -> (
      "Moved the feeding stack to a failover architecture to make the upgrades of clusters safer"
    ),
    //
    "experience.job.3.title"    -> "Senior Software Engineer",
    "experience.job.3.company"  -> "Teads - Infrastructure Reliability Team",
    "experience.job.3.timeline" -> ("January 2023 - April 2023", "Janvier 2023 - Avril 2023"),
    "experience.job.3.description.summary" -> (
      "Journey of one quarter in an infrastructure team to put in place the first kubernetes clusters for" +
        " our distributed caching stack"
    ),
    "experience.job.3.description.task.1" -> (
      "Defined generic modules on Terraform to bootstrap and manage a kubernetes cluster"
    ),
    "experience.job.3.description.task.2" -> (
      "Setup the ArgoCD tool to automatically deploy in production using a GitOps approach"
    ),
    //
    "experience.job.4.title"    -> "Senior Software Engineer",
    "experience.job.4.company"  -> "Teads - SSP Scaling Team",
    "experience.job.4.timeline" -> ("January 2021 - January 2023", "Janvier 2021 - Janvier 2023"),
    "experience.job.4.description.summary" -> (
      "Moved to a new team focused on scaling the SSP platform to handle at least twice as much traffic each year," +
        " while keeping the same levels of latency and reliability"
    ),
    "experience.job.4.description.task.1" -> ("Moved to a different pool of instances to handle each integration type accordingly"),
    "experience.job.4.description.task.2" -> (
      "Improved our ever growing distributed caching system to make developers able to easily provide new data to our platform"
    ),
    "experience.job.4.description.task.3" -> (
      "Extract some parts of the platform into new dedicated microservices communicating through gRPC"
    ),
    //
    "experience.job.5.title"    -> "Senior Software Engineer",
    "experience.job.5.company"  -> "Teads - SSP Team",
    "experience.job.5.timeline" -> ("January 2019 - January 2021", "Janvier 2019 - Janvier 2021"),
    "experience.job.5.description.summary" -> (
      "Kept working on the SSP platform while rotating between different business and technical focused lanes each quarter."
    ),
    "experience.job.5.description.task.1" -> ("Reworked our business setups to open our inventory worldwide"),
    "experience.job.5.description.task.2" -> ("Managed the integration of several third party data providers"),
    "experience.job.5.description.task.3" -> ("Helped data-science teams implement prediction models on the critical path"),
    //
    "experience.job.6.title"    -> "Software Engineer",
    "experience.job.6.company"  -> "Teads - SSP Team",
    "experience.job.6.timeline" -> ("September 2015 - January 2019", "Septembre 2015 - Janvier 2019"),
    "experience.job.6.description.summary" -> ("Developed a Supply Side Platform (SSP) managing thousands of auctions per second."),
    "experience.job.6.description.task.1" -> ("Implemented the OpenRTB protocol"),
    "experience.job.6.description.task.2" -> ("Delivered a rule engine to manage complex targeting rules"),
    "experience.job.6.description.task.3" -> ("Put in place a strong functional test stack to ensure no regression on the platform"),
    "experience.job.6.description.task.4" -> (
      "Migrated to a distributed caching system using Redis to improve the service latency and" +
        " decrease the load on the different databases we needed to read from"
    ),

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
    "references.translate" -> ("TODO", "TODO")
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
