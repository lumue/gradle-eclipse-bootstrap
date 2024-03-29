#bootstrapping eclipse wtp project with gradle

##basic java bootstrap

###building
activating java plugin http://www.gradle.org/docs/current/userguide/java_plugin.html
create src/test/main source folder
add a class
use some java 8 feature (date&time api, Clock) -> error
set jdk version
`gradle run`

###testing
refactor to extract TimeRenderer
create src/test/java source folder
add TimeRendererTest
add testCompile dependency (and maven repo)
run test


###running
`java -jar build/libs/gradle-eclipse-bootstrap.jar` -> error
add manifest attribute main-class

###distributing
activate application plugin http://www.gradle.org/docs/current/userguide/application_plugin.html
set version property

##setup eclipse project
need eclipse gradle tools

###generate eclipse project files
apply eclipse plugin
run eclipse task 
add generated files to .gitignore
```
/.settings/
/.classpath
/.project
```

###tweak generated files
add gradle project nature to .project file generation
```
eclipse.project {
  natures 'org.springsource.ide.eclipse.gradle.core.nature'
}
```
add gradle specific classpath entries
```
eclipseClasspath {
	containers "com.springsource.sts.gradle.classpathcontainer"
}
```

##add webapplication build

###configure gradle build
apply war plugin
add jee7 servlet-api dependencies
```
providedCompile 'javax.servlet:servlet-api:3.0.1'
```
set war basename (optional)
```
war{
	baseName = 'webapp'
}
```

###add some webcontent
create src/main/webapp folder
create index.html

###run with jetty
apply jetty plugin
`gradle jettyRun`
access app at http://localhost:8080/webapp

##setup eclipse wtp facet
apply eclipse-wtp plugin
error: Java compiler level does not match the version of the installed Java project facet.	
solution: patch from updatesite http://download.eclipse.org/webtools/patches/drops/R3.5.2/P-3.5.2-20140329045715/repository





