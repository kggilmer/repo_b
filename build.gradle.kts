import java.net.URL

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.dokka")  version "1.5.31"
}

group = "me.kggilmer"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.getByName<Delete>("clean") {
    // delete.add(projectDir.resolve("docs/gfm"))
    delete.add(projectDir.resolve("docs/html"))
}

/*
tasks.dokkaGfmMultiModule.configure {
    outputDirectory.set(projectDir.resolve("docs/gfm"))
}
*/

tasks.dokkaHtmlMultiModule.configure {
    outputDirectory.set(projectDir.resolve("docs/html"))
}

tasks.register("gen-docs") {
    // dependsOn("dokkaGfmMultiModule")
    dependsOn("dokkaHtmlMultiModule")
}
