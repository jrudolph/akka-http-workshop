scalaVersion := "2.11.7"

val akkaVersion = "2.4.2-RC2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,

  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion, // to support spray-json in akka-http
  "com.typesafe.akka" %% "akka-http-xml-experimental" % akkaVersion, // to support scala-xml in akka-http

  "org.scala-lang.modules" %% "scala-xml" % "1.0.5",
  "io.spray" %% "spray-json" % "1.3.2",

  // test dependencies
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.typesafe.akka" %% "akka-http-testkit-experimental" % akkaVersion % "test"
)