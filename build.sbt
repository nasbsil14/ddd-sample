name := "ddd-sample"

version := "1.0"

lazy val commonsetting = Seq(
  scalaVersion := "2.11.8",
  libraryDependencies ++= {
    val akkaVersion = "2.4.3"
    val scalaTestVersion = "2.2.6"
    Seq(
      "com.typesafe" % "config" % "1.3.0",
      "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-xml-experimental" % akkaVersion,
      "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion,
      "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
    )
  }
)

lazy val root = (project in file(".")).settings(commonsetting: _*)
lazy val core = (project in file("core")).settings(commonsetting: _*)
lazy val goodsContext = (project in file("goodsContext")).settings(commonsetting: _*).dependsOn(core)
lazy val orderContext = (project in file("orderContext")).settings(commonsetting: _*).dependsOn(core)
lazy val shipmentContext = (project in file("shipmentContext")).settings(commonsetting: _*).dependsOn(core)
lazy val shopContext = (project in file("shopContext")).settings(commonsetting: _*).dependsOn(core)
lazy val stockContext = (project in file("stockContext")).settings(commonsetting: _*).dependsOn(core)
