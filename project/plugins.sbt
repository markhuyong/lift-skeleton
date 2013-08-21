resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                  "maven-central-repo" at "http://repo1.maven.org/maven2",
                  "sbt-idea-repo" at "http://mpeltonen.github.com/maven")
                  
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.3.0")

//Enable the sbt idea plugin
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

//Enable the sbt eclipse plugin
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")
