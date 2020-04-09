## Sample project of maven configuration in yaml format

XML:
```xml
<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```

    **VS**
    
YAML
```yaml
dependencies:
  - {groupId: org.springframework.boot, artifactId: spring-boot-starter-web}
  - groupId: org.springframework.boot
    artifactId: spring-boot-starter-test
    scope: test
    exclusions:
      - {artifactId: junit-vintage-engine, groupId: org.junit.vintage}
build:
  plugins:
    - {groupId: org.springframework.boot, artifactId: spring-boot-maven-plugin}
```