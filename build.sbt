import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(new URL("http://github.com/evolution-gaming/prometheus-client-test")),
  startYear := Some(2020),
  organizationName := "Evolution Gaming",
  organizationHomepage := Some(url("http://evolution.com")),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.11", "2.12.18"),
  Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings"),
  scalacOptsFailOnWarn := Some(false),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  releaseCrossBuild := true,
  libraryDependencies ++= Seq(Prometheus.simpleclient),
  resolvers += Resolver.mavenLocal,
  resolvers += Resolver.bintrayRepo("evolutiongaming", "maven"),
  publishTo := Some(Resolver.evolutionReleases),
)

lazy val root = project.in(file("."))
  .aggregate(`prometheus-client-test`, `prometheus-client-test-scalatest30`)
  .settings(commonSettings)
  .settings(
    publish / skip := true
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
