name := "akka-analytic-engine"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.16",
  "org.apache.kafka" % "kafka-clients" % "0.10.1.1",
  "org.elasticsearch" % "elasticsearch" % "2.4.3",
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.4.16" % "test",
  "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"
)
    