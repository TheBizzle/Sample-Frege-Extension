resolvers += Resolver.url(
  "NetLogo-JVM",
  url("http://dl.bintray.com/content/netlogo/NetLogo-JVM"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("org.nlogo" % "netlogo-extension-plugin" % "3.0")
addSbtPlugin("org.nlogo" % "netlogo-extension-documentation" % "0.6")
addSbtPlugin("com.earldouglas" % "sbt-frege" % "1.1.1")


