plugins {
    id("org.springframework.boot")
}

dependencies {
    api(project(":common"))
}

tasks {
    jar {
        enabled = true
    }

    bootJar {
        enabled = false
    }
}
