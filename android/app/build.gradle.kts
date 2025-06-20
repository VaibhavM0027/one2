plugins {
    id("com.android.application")
    kotlin("android") version "2.1.0" // Specify Kotlin version here
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services") // Google services plugin
}

android {
    namespace = "com.example.one1"
    compileSdk = 35
    ndkVersion = "27.0.12077973"

    defaultConfig {
        applicationId = "com.example.one1"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
        kotlinOptions {
            jvmTarget = "11"
        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))
    implementation("com.google.firebase:firebase-analytics")
}

