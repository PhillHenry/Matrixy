// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "uk.co.odinconsultants"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// Open-source license of your choice
licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

// Where is the source code hosted: GitHub or GitLab?
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("PhillipHenry", "matrixy", "PhillHenry@gmail.com"))

// or if you want to set these fields manually
homepage := Some(url("https://github.com/PhillHenry/Matrixy"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/PhillHenry/Matrixy"),
    "scm:git@github.com:PhillHenry/Matrixy.git"
  )
)
developers := List(
  Developer(id = "henryp", name = "Phillip Henry", email = "PhillHenry@gmail.com", url = url("https://github.com/PhillHenry/Matrixy"))
)
