SET JAVA_HOME=C:\Java11\jdk-11.0.7
SET M2_HOME=E:\apache-maven-3.6.1
SET M2=%M2_HOME%\bin
SET Path=%path%;%M2%
set MAVEN_OPTS=-Xms768m -Xmx2048m -XX:PermSize=192m -XX:MaxPermSize=1024m 
mvn clean install -Djalopy.skip=true -Dmaven.test.skip=false -e -Dmaven.javadoc.skip=true
PAUSE