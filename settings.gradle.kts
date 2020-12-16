rootProject.name = "data-collector"

include("common")
include("common-test")
include("server")
include("server-test")

rootProject.children.forEach { project ->
    project.projectDir = file("subprojects/${project.name}")
    assert(project.projectDir.isDirectory)
}
