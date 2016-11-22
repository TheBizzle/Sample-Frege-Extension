import org.nlogo.build.NetLogoExtension

scalaVersion := "2.12.0"

enablePlugins(NetLogoExtension)
enablePlugins(org.nlogo.build.ExtensionDocumentationPlugin)

name := "frege"

netLogoExtName      := "frege"

netLogoClassManager := "org.nlogo.extensions.frege.FregeExtension"

netLogoTarget :=
  NetLogoExtension.directoryTarget(baseDirectory.value)

netLogoZipSources := false

fregeSource in Compile := baseDirectory.value / "src" / "main" / "frege"

scalaSource in Compile := baseDirectory.value / "src" / "main" / "scala"

scalaSource in Test := baseDirectory.value / "src" / "test"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-feature",
                      "-encoding", "utf-8")

libraryDependencies ++= Seq()

netLogoVersion := "6.0.0-BETA2"
