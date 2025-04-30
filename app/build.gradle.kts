plugins {
    application
    distribution
    checkstyle
    id("org.sonarqube") version "6.0.1.5171"
//    id("java")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"
application { mainClass = "hexlet.code.App"}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "olikkks_java-project-61")
        property("sonar.organization", "olikkks")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

