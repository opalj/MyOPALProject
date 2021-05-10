resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(
  Resolver.ivyStylePatterns
)
addSbtPlugin("org.scoverage"   %% "sbt-scoverage"         % "1.6.0")
addSbtPlugin("org.scalastyle"  %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scalameta"   % "sbt-scalafmt"           % "2.4.2")

// Dependency management:
addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "3.1.1")
addSbtPlugin("com.eed3si9n"     % "sbt-dirty-money"      % "0.2.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"          % "0.5.2")