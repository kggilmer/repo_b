import java.net.URL

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("me.kggilmer:thing-api:1.1")
    implementation("me.kggilmer:thing-impl:1.1")
}
