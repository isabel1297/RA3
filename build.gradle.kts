// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    // Configuración del buildscript si es necesario
}

allprojects {
    // Configuración común a todos los módulos
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
