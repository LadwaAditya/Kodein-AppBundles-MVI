object Versions {
    const val kotlin = "1.2.60"
    const val supportLibraryVersion = "27.1.1"
}

object Android {
    const val compileSdkVersion = 28
    const val buildToolsVersion = "28.0.2"
    const val minSdkVersion = 19
    const val targetSdkVersion = 28
}

object Support {
    const val supportv4 = "com.android.support:support-v4:${Versions.supportLibraryVersion}"
    const val appcompatv7 = "com.android.support:appcompat-v7:${Versions.supportLibraryVersion}"
    const val supportAnnotation = "com.android.support:support-annotations:${Versions.supportLibraryVersion}"
}

object Arch {
    //Room
    const val roomRuntime = "android.arch.persistence.room:runtime:1.0.0"
    const val roomRxAdapter = "android.arch.persistence.room:rxjava2:1.0.0"
    const val roomCompiler = "android.arch.persistence.room:compiler:1.0.0"
}

object Reactive {
    const val rxJava = "io.reactivex.rxjava2:rxjava:2.1.13"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.0.2"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.2.0"
    const val rxBinding = "com.jakewharton.rxbinding2:rxbinding-kotlin:2.1.1"
}

object Network {
    //Network (Retrofit, OkHttp, Logging interceptor)
    const val okhttp = "com.squareup.okhttp3:okhttp:3.9.1"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:3.9.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:2.3.0"
    const val gson = "com.squareup.retrofit2:converter-gson:2.3.0"
    const val moshi = "com.squareup.retrofit2:converter-moshi:2.3.0"
    const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:2.3.0"
}

object Debug {
    //Stetho
    const val stetho = "com.facebook.stetho:stetho:1.5.0"
    const val stethoOkhttp = "com.facebook.stetho:stetho-okhttp3:1.5.0"
    const val stethoNoOp = "net.igenius:stetho-no-op:1.1"

    //Chuck Interceptor
    const val chuck = "com.readystatesoftware.chuck:library:1.1.0"
    const val chuckNoOp = "com.readystatesoftware.chuck:library-no-op:1.1.0"

    //Leak Canary
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:1.5.4"
    const val leakcanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:1.5.4"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:4.6.1"
    const val glidePallet = "com.github.florent37:glidepalette:2.1.1"
    const val gileOkhttp = "com.github.bumptech.glide:okhttp3-integration:4.6.1"
    const val glideCompiler = "com.github.bumptech.glide:compiler:4.6.1"
}

object Testing {
    // Unit tests dependencies
    const val junit = "junit:junit:4.12"
    const val mockito = "org.mockito:mockito-core:2.10.0"
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin:1.5.0"
    const val hamcrest = "org.hamcrest:hamcrest-library:1.3"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:3.9.0"
    const val archTesting = "android.arch.core:core-testing:1.0.0"

    // Instrumentation test dependencies
    const val mockitoAndroid = "org.mockito:mockito-android:2.10.0"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:3.0.1"
    const val espressoIntents = "com.android.support.test.espresso:espresso-intents:3.0.1"
    const val supportRunner = "com.android.support.test:runner:1.0.1"
    const val supportRules = "com.android.support.test:rules:1.0.1"
    const val restMock = "com.github.andrzejchm.RESTMock:android:0.2.0"
    const val uiAutomator = "com.android.support.test.uiautomator:uiautomator-v18:2.1.3"
    const val testButler = "com.linkedin.testbutler:test-butler-library:1.3.1"
    const val espressoContrib = "com.android.support.test.espresso:espresso-contrib:2.2.2"
}

object Deps {
    //Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jre8:${Versions.kotlin}"

    //App Dependencies
    const val constraintLayout = "com.android.support.constraint:constraint-layout:1.1.2"

    //Logging
    const val timber = "com.jakewharton.timber:timber:4.5.1"
}