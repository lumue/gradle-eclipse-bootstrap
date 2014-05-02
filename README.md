#bootstrapping a eclipse wtp project with gradle

##basic java bootstrap


###building

activating java plugin http://www.gradle.org/docs/current/userguide/java_plugin.html
add a class
use some java 8 feature (date&time api, Clock) -> error
set jdk version
gradle run

###running jar
java -jar build/libs/gradle-eclipse-bootstrap.jar -> error
add manifest attribute main-class

###assembling
activate application plugin http://www.gradle.org/docs/current/userguide/application_plugin.html
set version property

###add some dependencies

###add a test

###run tests



 





