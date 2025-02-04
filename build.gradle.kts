plugins {
    id("java")
}

group = "com.sednanetwork"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.jsoup:jsoup:1.18.3")
}

tasks.test {
    useJUnitPlatform()
}