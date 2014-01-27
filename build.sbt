name := "helloApp"

version := "1.0-SNAPSHOT"


libraryDependencies ++= Seq(
  jdbc,
  cache,
  "com.novus" %% "salat" % "1.9.5"
)     

play.Project.playScalaSettings
