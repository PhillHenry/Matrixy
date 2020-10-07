import sbt._

object Dependencies {
  val scalaBinVersion   = "${scala.version}"

  val munit             = "org.scalameta" %% "munit" % "0.7.12" % Test
  val scala_library     = "org.scala-lang" % "scala-library" % "${scala.version}"
  val shapeless         = "com.chuusai" %% "shapeless" % "2.3.3"
  val refined           = "eu.timepit" %% "refined" % "0.9.16"
  val simulacrum        = "org.typelevel" %% "simulacrum" % "1.0.0"

}
