import sbt._

object Dependencies {

  object Prometheus {
    private val version = "0.9.999-evo1"
    val simpleclient    = "io.prometheus" % "simpleclient" % version
  }

  val scalatest30 = "org.scalatest" %% "scalatest" % "3.0.9"
  val scalatest31 = "org.scalatest" %% "scalatest" % "3.2.15"
}