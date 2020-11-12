import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(new URL("http://github.com/evolution-gaming/prometheus-client-test")),
  startYear := Some(2020),
  organizationName := "Evolution Gaming",
  organizationHomepage := Some(url("http://evolutiongaming.com")),
  bintrayOrganization := Some("evolutiongaming"),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.3", "2.12.10"),
  scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits", "-no-link-warnings"),
  scalacOptsFailOnWarn := Some(false),
  resolvers += Resolver.bintrayRepo("evolutiongaming", "maven"),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  releaseCrossBuild := true,
  libraryDependencies ++= Seq(Prometheus.simpleclient),
  resolvers += Resolver.mavenLocal
)

lazy val root = project.in(file("."))
  .aggregate(`prometheus-client-test`, `prometheus-client-test-scalatest30`)
  .settings(commonSettings)
  .settings(
    skip in publish := true
  )

lazy val `prometheus-client-test` = project
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(scalatest31),
  )

lazy val `prometheus-client-test-scalatest30` = project
  .settings(commonSettings)
  .settings(
      libraryDependencies ++= Seq(scalatest30),
  )
