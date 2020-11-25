# IDEA-VM
-javaagent:src/main/resources/springloaded-1.2.5.RELEASE.jar -noverify

# java
java -jar springloaded-test-1.0.0.jar -javaagent:springloaded-1.2.6.RELEASE.jar  -noverify  -Dspringloaded=verbose;watchJars=springloaded-test-1.0.0.jar


java -classpath springloaded-test-1.0.0.jar -Dspringloaded="verbose;watchJars=springloaded-test-1.0.0.jar" -javaagent:springloaded-1.2.5.RELEASE.jar -noverify com.lind.springloaded.AppApplication


java -Dspringloaded=verbose;explain;watchJars=springloaded-test-1.0.0.jar -javaagent:springloaded-1.2.5.RELEASE.jar -noverify -cp springloaded-test-1.0.0.jar com.lind.springloaded.AppApplication



java -javaagent:d:\springloaded-1.2.6.RELEASE.jar  -noverify    com.lind.springloaded.AppApplication


一、查询jar包中要替换的文件位置

jar  -tvf  a-start-hot-deploy-1.0.0.jar   |  grep  Reload.class

二、解压指定路径下的文件

jar -xvf springloaded-test-1.0.0.jar  com/lind/springloaded/Load.class

三、修改这个RunApplication.class文件

四、更新到jar包中

jar  -uvf  springloaded-test-1.0.0.jar   com/lind/springloaded/Reload.class #更新
jar  -cvMf  springloaded-test-1.0.0.jar   com/lind/springloaded/Reload.class  #建立新的
