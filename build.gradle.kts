plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testCompile("junit", "junit", "4.12")
    implementation("org.testng:testng:7.4.0")
}

tasks.getByName<Test>("test"){
    useTestNG()
}
