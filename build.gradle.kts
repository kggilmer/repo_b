import org.jetbrains.kotlin.gradle.plugin.statistics.ReportStatisticsToElasticSearch.url
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.net.URL

plugins {
    java
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.dokka")  version "1.5.31"
}

group = "me.kggilmer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("me.kggilmer:repo_a:1.0-SNAPSHOT")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.dokkaGfm.configure {
    outputDirectory.set(projectDir.resolve("docs/gfm"))
    dokkaSourceSets.configureEach {
        externalDocumentationLink {
            packageListUrl.set(URL("https://raw.githubusercontent.com/kggilmer/repo_a/main/docs/gfm/repo_a/package-list"))
            url.set(URL("https://kggilmer.github.io/repo_a/gfm/"))
        }
    }
}

tasks.dokkaHtml.configure {
    outputDirectory.set(projectDir.resolve("docs/html"))
    dokkaSourceSets.configureEach {
        externalDocumentationLink {
            packageListUrl.set(URL("https://raw.githubusercontent.com/kggilmer/repo_a/main/docs/html/repo_a/package-list"))
            url.set(URL("https://kggilmer.github.io/repo_a/html/"))
        }
    }
}
