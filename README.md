# HelloWorldKotlinMavenSpring

A repository with a HelloWorld Kotlin application with Maven and Spring Boot.

## Medium article

[](https://....com)

## Getting Started

This application contains a HelloWorld application created with Maven with Maven and Spring Boot.

### Prerequisites

To use this, you need java 8, Maven 3+ and Intellij IDEA installed in your local environment.

### Builing

For building the project you need to execute this command:

```sh
$> mvn clean package spring-boot:repackage -U -DskipTests=true
```

### Running the application

For running the project you need to execute this command:

```sh
$> mvn spring-boot:run
```

## Running the tests

For running all the tests

```sh
$>  mvn clean package spring-boot:repackage -U -DskipTests=true && mvn verify
```

## Git

### Tagging

For creating a tag pointing to a commit

```sh
$> git tag -a <version> <commit-sha> -m "<message>"
```

## Built With

* [Kotlin](https://kotlinlang.org/) - The Kotlin programming language
* [Maven](https://maven.apache.org//) - Dependency Management
* [Git](https://git-scm.com/) - Distributed version-control system
