addSbtPlugin("com.47deg" % "sbt-microsites" % "1.1.2")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.32")

addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("io.github.cquiroz" % "sbt-tzdb" % "0.4.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.1")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.11")

