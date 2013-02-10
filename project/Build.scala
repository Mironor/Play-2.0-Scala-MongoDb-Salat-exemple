import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "todoPlay"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.novus" %% "salat" % "1.9.2-SNAPSHOT",
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  )

}
