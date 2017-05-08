name 							:= "MyOPALProject"

organization	in ThisBuild 	:= "org.exmple"
version 		in ThisBuild 	:= "0.1.0-SNAPSHOT"
scalaVersion 	in ThisBuild 	:= "2.11.11"

fork 			in run 			:= true
// javaOptions 	in run 			+= "-Xmx4G" // BETTER: javaOptions in run += "-Xmx16G"
// javaOptions 	in run 			+= "-Xms2G"
javaOptions 	in ThisBuild 	++= Seq(
	"-Dorg.opalj.threads.CPUBoundTasks=4", // Number of physical (not hyperthreaded) cores/CPUs
	"-Dorg.opalj.threads.IOBoundTasks=12" // Number of (hyperthreaded) cores * 1,5
)

libraryDependencies += "de.opal-project" %% "abstract-interpretation-framework" % "0.8.12"