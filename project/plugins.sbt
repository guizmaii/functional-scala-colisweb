resolvers ++= Seq(
  Classpaths.typesafeReleases,
  Classpaths.sbtPluginReleases,
  "jgit-repo" at "http://download.eclipse.org/jgit/maven",
  "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
)

addSbtPlugin("io.get-coursier"  % "sbt-coursier" % "1.0.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"  % "0.3.4")
addSbtPlugin("com.geirsson"     % "sbt-scalafmt" % "1.6.0-RC1")
