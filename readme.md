# IDEA-VM
-javaagent:src/main/resources/springloaded-1.2.5.RELEASE.jar -noverify

# java
java -javaagent:springloaded-1.2.5.RELEASE.jar   -Dspringloaded="verbose;watchJars=springloaded-test-1.0-SNAPSHOT.jar" -noverify -jar springloaded-test-1.0-SNAPSHOT.jar

java -javaagent:springloaded-1.2.5.RELEASE.jar  -Dspringloaded="verbose;explain;watchJars=springloaded-test-1.0-SNAPSHOT.jar" -noverify -jar springloaded-test-1.0-SNAPSHOT.jar