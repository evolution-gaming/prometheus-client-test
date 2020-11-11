import sbt._

object Dependencies {

  object Prometheus {
    private val version = "0.9.999-evo1"
    val simpleclient    = "io.prometheus" % "simpleclient" % version
  }

  val scalatest = "org.scalatest" %% "scalatest" % "3.1.0"
}