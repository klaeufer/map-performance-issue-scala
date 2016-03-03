name := "map-performance-issue-scala"

scalaVersion := "2.10.6"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies += "com.storm-enroute" %% "scalameter" % "0.7" % Test

parallelExecution in Test := false

logBuffered := false
