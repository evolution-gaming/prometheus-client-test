import Dependencies.*

lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(url("https://github.com/evolution-gaming/prometheus-client-test")),
  startYear := Some(2020),
  organizationName := "Evolution",
  organizationHomepage := Some(url("https://evolution.com")),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.18", "3.3.8"),
  Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings"),
  scalacOptsFailOnWarn := Some(false),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  libraryDependencies ++= Seq(Prometheus.simpleclient),
  publishTo := Some(Resolver.evolutionReleases),
  versionPolicyIntention := Compatibility.BinaryCompatible,
)

val alias: Seq[sbt.Def.Setting[?]] =
  addCommandAlias("check", "+all scalafmtCheckRepo versionPolicyCheck Compile/doc") ++
    addCommandAlias("fmt", "scalafmtRepo") ++
    addCommandAlias("build", "+all compile test")

lazy val root = project.in(file("."))
  .aggregate(`prometheus-client-test`)
  .settings(commonSettings)
  .settings(alias)
  .settings(
    publish / skip := true,
  )

lazy val `prometheus-client-test` = project
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(scalatest),
  )
