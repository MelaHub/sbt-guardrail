sbtPlugin := true

name := "sbt-guardrail"
organization := "com.twilio"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.12.6"
scalacOptions += "-feature"

// Versioning
enablePlugins(GitBranchPrompt)
enablePlugins(GitVersioning)
git.useGitDescribe := true


// Dependencies
resolvers += Resolver.bintrayRepo("twilio", "releases")
libraryDependencies += "com.twilio" %% "guardrail" % "0.36.1"

// Release
bintrayOrganization := Some("twilio")
bintrayReleaseOnPublish := false
bintrayRepository := {
  if (isSnapshot.value) "snapshots"
  else "releases"
}
publishMavenStyle := true
