# Spring boot command line application

This is basic use of spring boot application. Which can read command line arguments.

## Getting Started

To Understand the basic flow of spring boot command line application, refer official documentation=> http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-documentation 

### Prerequisities

1. Install gradle.
	a. from Refer=> https://docs.gradle.org/current/userguide/installation.html OR
	b. Install using apt-get refer=> http://askubuntu.com/questions/328178/gradle-in-ubuntu 
2. install jdk 1.7 or above( set path for JAVA_HOME)
	a. It should be sun jdk refer=> http://www.oracle.com/technetwork/java/javase/downloads/index.html
	
### Installing

1. Use {./gradlew clean} command to clean the build.
2. Use {./gradlew build} command to build the application.

## Deployment

 java -jar {path to project}/build/libs/spring_boot_command_line-0.1.0.jar arg[0] arg[1] ..
	(where arg[0] and arg[1] are arguements to the jar)

## Built With

* Gradle 		  2.10
* Groovy:       2.4.4
* Ant:          Apache Ant(TM) version 1.9.3 compiled on December 23 2013
* JVM:          1.7.0_79 (Oracle Corporation 24.79-b02)
* OS:           Linux 3.16.0-55-generic amd64

## Contributing

Feel free to contribute to this sample project.

## Versioning

I am using 0.1.0 as the very first version.

## Authors

Bhavesh Kumar - *Initial work* - [bhaveshag](https://github.com/bhaveshag)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc

