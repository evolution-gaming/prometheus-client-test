import Dependencies._

lazy val actor = (project in file("."))
  .settings(
    organization := "com.evolutiongaming",
    name := "prometheus-client-test",
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
    libraryDependencies ++= Seq(
      Prometheus.simpleclient,
      scalatest,
    ),
    resolvers += Resolver.mavenLocal
  )