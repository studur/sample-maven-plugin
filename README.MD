# Sample maven plugin

This project serves as a template and example for maven plugin development.

# Build

To build project, simply execute

```bash
mvn clean install
```

# Usage

To use the plugin from the command line, first execute the installation first so that the plugin will be available locally.

Then, execute the following command:

```bash
mvn ca.telagene:sample-maven-plugin:0.0.1-SNAPSHOT:execute -DstringToLog="this is a test"
```

To use from a maven project, use the following plugin configuration

```
<build>
    <plugins>
        <plugin>
            <groupId>ca.telagene</groupId>
            <artifactId>sample-maven-plugin</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <executions>
                <execution>
                    <goals>
                        <goal>execute</goal>
                    </goals>
                    <configuration>
                        <stringToLog>this is a test</stringToLog>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
