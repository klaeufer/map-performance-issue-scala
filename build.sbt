name := "map-performance-issue-scala"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies += "com.storm-enroute" %% "scalameter" % "0.10" % Test

parallelExecution in Test := false

logBuffered := false
