# springboot-react-jobportal-app
This Spring Boot with ReactJS sample app demonstrates.

# Creating a React App

Working with React does require that Node.js needs to be installed, And follow the below command to create the React App.
  <strong>npx create-react-app app-frontend </strong>

After the react app creation, we'll install Bootstrap, React Router, and reactstrap in the app-frontend directory:
  <strong>npm install --save bootstrap@5.1 react-cookie@4.1.1 react-router-dom@5.3.0 reactstrap@8.10.0 </<strong>>

Let's add Bootstrap's CSS file as an import in app/src/index.js:
    import 'bootstrap/dist/css/bootstrap.min.css';

To make your UI alignment fix, add a top margin to Bootrap’s container classes in app/src/App.css.
 .container, .container-fluid {
    margin-top: 20px;
    }

# Starting Our React app
    Now, our React app is ready to start our frontend application, follow the below command to start.
<strong>npm start <strong>, can access react APP: http://localhost:3000 

# Calling Our Spring Boot API
To call our spring Boot API needs to set up our React application with package.json file to configure a proxy when calling the API.For that, we needs to be added URL for our API in package.json:
  
    ...
    "proxy": "http://localhost:8080",
    ... 
   

# Building and Packaging the Application:
To build and package our React application with Spring Boot using Maven, we'll use the frontend-maven-plugin.

This plugin will be responsible for packaging and copying our frontend application into our Spring Boot API build folder, used the below maven entry:

   	...
	<properties>
        <java.version>1.8</java.version>
       <frontend-maven-plugin.version>1.11.3</frontend-maven-plugin.version>
        <node.version>v15.10.0</node.version>
        <yarn.version>v1.22.17</yarn.version>
	</properties>
    	...
       <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    <!-- To build Dev Environment -->
    <profiles>
        <profile>
            <id>dev</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <spring.profiles.active>dev</spring.profiles.active>
            </properties>
        </profile>
        <!-- To build Prod Environment -->
        <profile>
            <id>prod</id>
            <build>
                <plugins>
                    <plugin>
                        <artifactId>maven-resources-plugin</artifactId>
                        <executions>
                            <execution>
                                <id>copy-resources</id>
                                <phase>process-classes</phase>
                                <goals>
                                    <goal>copy-resources</goal>
                                </goals>
                                <configuration>
                                    <outputDirectory>${basedir}/target/classes/static</outputDirectory>
                                    <resources>
                                        <resource>
                                            <directory>app-frontend/build</directory>
                                        </resource>
                                    </resources>
                                </configuration>
                            </execution>
                        </executions>
                    </plugin>
                    <plugin>
                        <groupId>com.github.eirslett</groupId>
                        <artifactId>frontend-maven-plugin</artifactId>
                        <version>${frontend-maven-plugin.version}</version>
                        <configuration>
                            <workingDirectory>app-frontend</workingDirectory>
                        </configuration>
                        <executions>
                            <execution>
                                <id>install node</id>
                                <goals>
                                    <goal>install-node-and-yarn</goal>
                                </goals>
                                <configuration>
                                    <nodeVersion>${node.version}</nodeVersion>
                                    <yarnVersion>${yarn.version}</yarnVersion>
                                </configuration>
                            </execution>
                            <execution>
                                <id>yarn install</id>
                                <goals>
                                    <goal>yarn</goal>
                                </goals>
                                <phase>generate-resources</phase>
                            </execution>
                            <execution>
                                <id>yarn test</id>
                                <goals>
                                    <goal>yarn</goal>
                                </goals>
                                <phase>test</phase>
                                <configuration>
                                    <arguments>test</arguments>
                                    <environmentVariables>
                                        <CI>true</CI>
                                    </environmentVariables>
                                </configuration>
                            </execution>
                            <execution>
                                <id>yarn build</id>
                                <goals>
                                    <goal>yarn</goal>
                                </goals>
                                <phase>compile</phase>
                                <configuration>
                                    <arguments>build</arguments>
                                </configuration>
                            </execution>
                        </executions>
                    </plugin>
                </plugins>
            </build>
            <properties>
                <spring.profiles.active>prod</spring.profiles.active>
            </properties>
        </profile>
    </profiles>



# To build for Developemnt environment: 
<strong> mvn clean install -P dev</strong>

## To build for Production environemnt: 
<strong> mvn clean install -P prod</strong>

## Spring Boot API with React App:
 At the end, by adding the plugin, we can access our application by running spring boot application
 Now the React app will be fully integrated into our Spring Boot API, we can Access the application URL: http://localhost:8080/ 

### Technology Used

 Sample project uses a number of open source projects to work properly:

* [SpringBoot] - REST API Application framework
* [ReactJS] - Frontend UI 
* [Nodejs] - NodeJS
* [Maven] - Build Tool
* [H2]    -  in memory database
* [Swagger] - API documentation

### Development environment setup

Follow the steps to bring up the development environment in your local and access the app.

1) Install Git, Java, Maven and npm or yarn</br>
2) Clone the project using "git clone https://github.com/Bharathidasan-tech/springboot-react-jobportal-app.git" </br>
3) Build in local and Run</br>
4) Also run command -> "java -jar springboot-react-jobportal-app-0.0.1-SNAPSHOT.war"</br>
5) Access the Application at http://localhost:8080/</br>

## APP UI 

ULR: http://localhost:8080

![Home Page](https://github.com/Bharathidasan-tech/springboot-react-jobportal-app/blob/main/documents/screens/homescreen.png)

![List Page](https://github.com/Bharathidasan-tech/springboot-react-jobportal-app/blob/main/documents/screens/listpage.png)

![Edit Details](https://github.com/Bharathidasan-tech/springboot-react-jobportal-app/blob/main/documents/screens/editpage.png)

![Add Details](https://github.com/Bharathidasan-tech/springboot-react-jobportal-app/blob/main/documents/screens/addpage.png)

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job.)


   [SpringBoot]: <https://projects.spring.io/spring-boot/>
   [ReactJS]: https://reactjs.org/
   [Maven]: <https://maven.apache.org>
   [Git]: <https://git-scm.com>
   [Java]: <https://go.java>
   [Swagger]: <https://swagger.io/>
   [Nodejs]: https://nodejs.org/en/
   [H2]: https://www.h2database.com/html/main.html
