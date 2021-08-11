Firstly, you need to alter database configuration to your WMS instance in
/src/main/java/packages/DB.java

To build app you should have Maven installed on your machine

Run
mvn install -f pom.xml

After successful compilation a jar executable will be generated in "target" folder.
The executable name is "Parser-jar-with-dependencies.jar", you can move it to
wherever you want.

To Run the application you must specify the platform id in the arguments
Example: java -jar Parser-jar-with-dependencies.jar 1
java -jar Parser-jar-with-dependencies.jar < platform_id >

Available list of platforms:
1 - Dreamlove