val springBootVersion: String by project
val deFlapdoodleEmbedMongoVersion: String by project
val reactorTestVersion: String by project

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    testImplementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo:$deFlapdoodleEmbedMongoVersion")
    testImplementation("io.projectreactor:reactor-test:$reactorTestVersion")
}
