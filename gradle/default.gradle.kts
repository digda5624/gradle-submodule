buildscript {
    apply(from = "${rootDir}/gradle-submodule/gradle/properties.gradle.kts")

    val versions: Map<String, MutableMap<String, Any>> by extra

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions["langs"]!!["kotlin"]}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${versions["langs"]!!["kotlin"]}")
        classpath("org.jetbrains.kotlin:kotlin-noarg:${versions["langs"]!!["kotlin"]}")
    }
}

apply(plugin = "kotlin")
apply(plugin = "java")

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }
}

repositories {
    mavenCentral()
}
