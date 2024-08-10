/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {

    `java-library`
    `maven-publish`
    id("io.quarkus")
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}
val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project


dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    api(libs.io.quarkus.quarkus.undertow)
    api(libs.io.quarkus.quarkus.arc)
    api(libs.org.cometd.java.cometd.java.api.server)
    api(libs.org.cometd.javascript.cometd.javascript.common)
    api(libs.org.cometd.java.cometd.java.server.http.jakarta)
    api(libs.org.cometd.java.cometd.java.server.websocket.jakarta)
    // api(libs.org.eclipse.jetty.jetty.jmx)
    // api(libs.org.eclipse.jetty.ee10.jetty.ee10.servlets)
    // api(libs.org.eclipse.jetty.jetty.slf4j.impl)
    // api(libs.org.eclipse.jetty.jetty.util)
    api(libs.org.eclipse.jetty.jetty.util.ajax)
    testImplementation(libs.io.quarkus.quarkus.junit5)
}

group = "io.truthencode.poc"
version = "1.0.0-SNAPSHOT"
description = "cometd-quarkus"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
