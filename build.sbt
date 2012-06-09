name := "minescala"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Bukkit Releases" at "http://repo.bukkit.org/content/repositories/releases/"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.9.1", // Supposed to be included on assembly, but isn't unless specified here
  "org.bukkit" % "bukkit" % "1.2.5-R3.0" % "provided", // Use for compilation, but don't include for assembly
  "javax.servlet" % "servlet-api" % "2.4" % "provided" // Fixes "Missing dependency 'class javax.servlet.ServletContext'"
)

assemblySettings