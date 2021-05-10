organization := "org.me"
version := "0.1-SNAPSHOT"
name := "netlogo-extension-language-server-library"

isSnapshot := true

scalaVersion := "2.12.12"

Compile / scalaSource := baseDirectory.value / "src"

resolvers += "netlogo" at "https://dl.cloudsmith.io/public/netlogo/netlogo/maven/"

libraryDependencies ++= Seq(
  "org.nlogo" % "netlogo" % "6.2.0"
)
