plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.real_time_image_classifier"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.real_time_image_classifier"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    val cameraxVersion = "1.3.0-rc01"
    implementation (libs.androidx.xcamera.core)
    implementation(libs.androidx.camera.camera2)
    implementation (libs.androidx.xcamera.lifecycle)
    implementation (libs.androidx.xcamera.video)
    implementation (libs.androidx.xcamera.view)
    implementation (libs.androidx.xcamera.extensions)
    implementation (libs.xtensorflow.lite.task.vision)
    implementation (libs.xtensorflow.lite.gpu.delegate.plugin)
    implementation (libs.xtensorflow.lite.gpu)
}