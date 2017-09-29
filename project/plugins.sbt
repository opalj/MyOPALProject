scalacOptions ++= Seq( "-unchecked", "-deprecation" )

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2"
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.0")
