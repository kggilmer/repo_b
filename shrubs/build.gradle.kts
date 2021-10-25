import java.net.URL

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("me.kggilmer:repo_a:1.0-SNAPSHOT")
}

tasks.dokkaHtmlPartial.configure {
    dokkaSourceSets.configureEach {
        externalDocumentationLink {
            packageListUrl.set(URL("https://raw.githubusercontent.com/kggilmer/repo_a/main/docs/html/package-list"))
            url.set(URL("https://kggilmer.github.io/repo_a/html/"))
        }
    }
}