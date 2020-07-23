echo "Creating config"
#get it's PID
PID=$!

#create jar
mvn clean package -DskipTests

#run with agent lib to create needed config
java -agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image \
-Dorg.graalvm.native.image.imagecode=agent \
\-jar target/merchant-kfc-0.0.1-SNAPSHOT.jar