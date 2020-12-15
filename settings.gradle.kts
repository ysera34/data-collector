rootProject.name = "data-collector"

include("common")
include("server")

rootProject.children.forEach { project ->
    project.projectDir = file("subprojects/${project.name}")
    assert(project.projectDir.isDirectory)
}
