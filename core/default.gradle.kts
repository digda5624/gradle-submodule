// build.gradle.kts 에서 buildScript classpath 직접 작성해야 함
apply(plugin = "java")
apply(plugin = "kotlin")

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }
}

repositories {
    mavenCentral()
}
