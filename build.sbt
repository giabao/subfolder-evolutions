lazy val commonSettings = Seq(
  organization := "com.sandinh",
  version := "2.6.6",
  scalaVersion := "2.12.4",
  crossScalaVersions := Seq("2.11.11", "2.12.4"),
  scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-feature", "-target:jvm-1.8"),
  scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 11)) => Seq("-Ybackend:GenBCode")
    case _ => Nil
  })
)

lazy val module = project
  .settings(commonSettings: _*)
  .settings(
    name := "subfolder-evolutions",
    libraryDependencies += evolutions
  )

lazy val sample = project
  .settings(commonSettings: _*)
  .settings(
    name := "sample-app",
    publishArtifact := false,
    libraryDependencies += specs2 % Test
  ).dependsOn(module)

lazy val `subfolder-evolutions-root` = project.in(file("."))
  .settings(commonSettings: _*)
  .settings(
    publishArtifact := false
  ).aggregate(module, sample)
