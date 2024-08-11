# cometd-quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

It is a basic example of using the CometD protocol with Quarkus.
The code is based on the example from the CometD documentation: <https://docs.cometd.org/current8/reference/#_primer>.

## Goals
The goal of this project is to provide a simple example of using the CometD protocol with Quarkus and to provide a starting point for further development.

This build should function in both Maven and Gradle.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:


<details>
<summary>Running application in dev mode</summary>
```shell script CLI
quarkus dev
```
```shell script Gradle
./gradlew quarkusDev
```
```shell script Maven
./mvnw compile quarkus:dev
```
</details>


> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/cometd-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

