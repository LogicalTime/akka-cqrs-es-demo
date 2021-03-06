import sbt._

object Version {
  final val Akka = "2.4.7"
  final val AkkaPersistenceCassandra = "0.17"
  final val AkkaLog4j = "1.1.4"
  final val AkkaHttpJson = "1.7.0"
  final val Circe = "0.4.1"
  final val CamelRabbitMQ = "2.13.4"
  final val Slick = "3.1.1"
  final val HikariCP = "2.4.5"
  final val MariaDB = "1.4.6"
  final val Log4j = "2.6"
  final val SwaggerAkka = "0.7.1"
  final val ScalaCheck = "1.13.0"
  final val ScalaTest = "3.0.0-RC2"
  final val Scala = "2.11.7"
}

object Library {
  val akkaHttp = "com.typesafe.akka" %% "akka-http-experimental" % Version.Akka
  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % Version.Akka
  val akkaPersistenceCassandra = "com.typesafe.akka" %% "akka-persistence-cassandra" % Version.AkkaPersistenceCassandra
  val akkaCamel = "com.typesafe.akka" %% "akka-camel" % Version.Akka
  val camelRabbitMQ = "org.apache.camel" % "camel-rabbitmq" % Version.CamelRabbitMQ
  val akkaHttpCirce = "de.heikoseeberger" %% "akka-http-circe" % Version.AkkaHttpJson
  val circeGeneric = "io.circe" %% "circe-generic" % Version.Circe
  val circeParser = "io.circe" %% "circe-parser" % Version.Circe
  val circeJava8 = "io.circe" %% "circe-java8" % Version.Circe
  val slick = "com.typesafe.slick" %% "slick" % Version.Slick
  val hikariCP = "com.zaxxer" % "HikariCP" % Version.HikariCP
  val mariaDb = "org.mariadb.jdbc" % "mariadb-java-client" % Version.MariaDB
  val swaggerAkka = "com.github.swagger-akka-http" %% "swagger-akka-http" % Version.SwaggerAkka
  val akkaLog4j = "de.heikoseeberger" %% "akka-log4j" % Version.AkkaLog4j
  val log4jCore = "org.apache.logging.log4j" % "log4j-core" % Version.Log4j
  val slf4jLog4jBridge = "org.apache.logging.log4j" % "log4j-slf4j-impl" % Version.Log4j
  val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.ScalaCheck
  val scalaTest = "org.scalatest" %% "scalatest" % Version.ScalaTest
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % Version.Akka
  val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit" % Version.Akka
}
