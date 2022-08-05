import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
  `kotlin-dsl`
  "java"
  "groovy"
}
//apply plugin: 'groovy'
//apply plugin: 'java'

repositories {
  google()
  mavenCentral()
}

dependencies {
  implementation(gradleApi())
  implementation(localGroovy())

  implementation("com.samskivert:jmustache:1.10")
  implementation("com.google.guava:guava:24.1-jre")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}
