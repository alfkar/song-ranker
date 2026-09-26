plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("org.itsallcode.openfasttrace") version "3.1.2"
}

requirementTracing {
    failBuild = true
    inputDirectories = files("requirements/specification.md", "app/src")
    reportFormat = "plain"
}

tasks.register("verifyRequirements") {
    group = "verification"
    description = "Runs unit tests and checks requirement-to-test traceability."
    dependsOn(":app:testDebugUnitTest", "traceRequirements")
}
