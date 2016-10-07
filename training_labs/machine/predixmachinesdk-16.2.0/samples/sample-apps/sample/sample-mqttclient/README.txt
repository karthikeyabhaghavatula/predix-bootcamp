

MQTT Client Sample - Shows how to use the MQTT Client to publish a message or subscribe to a topic 

You needs to update the source code to have proper information of broker, username and password of
your MQTT server.

NOTE: this samples requires MQTT APIs. This means these items should be pushed to a local artifactory so that these can be resolved:

        <dependency>
            <groupId>org.eclipse.paho</groupId>
            <artifactId>org.eclipse.paho.client.mqttv3</artifactId>
            <version>${mqtt-client.version}</version>
        </dependency>

        
The jar can be download from http://git.eclipse.org/c/paho/org.eclipse.paho.mqtt.java.git/ or extracted out of the com.ge.dspmicro.mqtt-client-XXX.jar

For example:
mvn install:install-file -DgroupId=org.eclipse.paho \
-DartifactId=org.eclipse.paho.client.mqttv3 \
-Dversion=1.0.2 \
-Dfile=org.eclipse.paho.client.mqttv3-1.0.2.jar \
-Dpackaging=jar \
-DgeneratePom=true
