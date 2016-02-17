scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.2-RC2",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.2-RC2",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.2-RC2",
  "io.spray" %% "spray-json" % "1.3.2",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.typesafe.akka" %% "akka-http-testkit-experimental" % "2.4.2-RC2" % "test"
)