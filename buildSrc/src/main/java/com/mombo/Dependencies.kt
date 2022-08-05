package com.mombo

object Dependencies {

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    const val appsFlyer = "com.appsflyer:af-android-sdk:${Versions.appsFlyer}"

    const val aspectjweaver = "org.aspectj:aspectjweaver:${Versions.aspectjweaver}"

    const val cameraXCamera2 = "androidx.camera:camera-camera2:${Versions.cameraX}"
    const val cameraXLifecycle = "androidx.camera:camera-lifecycle:${Versions.cameraX}"
    const val cameraXView = "androidx.camera:camera-view:${Versions.cameraXView}"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val exifInterface = "androidx.exifinterface:exifinterface:${Versions.exifInterface}"

    const val facebookLogin = "com.facebook.android:facebook-login:${Versions.facebookLogin}"

    const val fastAdapter = "com.mikepenz:fastadapter:${Versions.fastAdapter}"
    const val fastAdapterDiff = "com.mikepenz:fastadapter-extensions-diff:${Versions.fastAdapter}"
    const val fastAdapterDrag = "com.mikepenz:fastadapter-extensions-drag:${Versions.fastAdapter}"
    const val fastAdapterPaged = "com.mikepenz:fastadapter-extensions-paged:${Versions.fastAdapter}"
    const val fastAdapterSwipe = "com.mikepenz:fastadapter-extensions-swipe:${Versions.fastAdapter}"
    const val fastAdapterUtils = "com.mikepenz:fastadapter-extensions-utils:${Versions.fastAdapter}"

    const val firebaseAppDistributionGradle = "com.google.firebase:firebase-appdistribution-gradle:${Versions.firebaseAppDistributionGradle}"

    const val googleLicenses = "com.google.android.gms:play-services-oss-licenses:${Versions.googleLicenses}"
    const val googleLicensesGradlePlugin = "com.google.android.gms:oss-licenses-plugin:${Versions.googleLicensesGradlePlugin}"

    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"

    const val giphy = "com.giphy.sdk:ui:${Versions.giphy}"

    const val jsoup = "org.jsoup:jsoup:${Versions.jsoup}"

    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"

    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    const val material = "com.google.android.material:material:${Versions.material}"

    const val androidAnnotations = "androidx.annotation:annotation:${Versions.androidAnnotations}"

    const val photoView = "com.github.chrisbanes:PhotoView:${Versions.photoView}"

    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"


    const val discreteScrollView = "com.github.yarolegovich:DiscreteScrollView:${Versions.discreteScrollView}"

    const val scrollingPagerIndicator = "ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:${Versions.scrollingPagerIndicator}"

    const val ffmpeg = "com.arthenica:mobile-ffmpeg-full:${Versions.ffmpeg}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideOkHttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"

    /*new dependencies format -> we should start using it this way, we can discuss on tech call*/

    object PlayServices {
        private const val gcmVersion = "17.0.0"
        private const val locationVersion = "17.0.0"
        private const val mapsVersion = "18.0.1"

        const val gcm = "com.google.android.gms:play-services-gcm:${gcmVersion}"
        const val location = "com.google.android.gms:play-services-location:${locationVersion}"
        const val maps = "com.google.android.gms:play-services-maps:${mapsVersion}"
    }

    object Maps {
        private const val ktxVersion = "3.2.0"

        const val mapsKtx = "com.google.maps.android:maps-ktx:${ktxVersion}"
        const val mapsUtilsKtx = "com.google.maps.android:maps-utils-ktx:${ktxVersion}"
    }

    object AndroidX {
        object Activity {
            private const val version = "1.3.1"
            const val core = "androidx.activity:activity:${version}"
            const val ktx = "androidx.activity:activity-ktx:${version}"
            const val compose = "androidx.activity:activity-compose:${version}"
        }

        object Fragment {
            private const val version = "1.4.0"
            const val core = "androidx.fragment:fragment:${version}"
            const val ktx = "androidx.fragment:fragment-ktx:${version}"
        }

        object ChromeTabs {
            private const val version = "1.4.0"
            const val core = "androidx.browser:browser:${version}"
        }

        object Lifecycle {
            private const val version = "2.4.0"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${version}"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${version}"
            const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${version}"
        }

        object Navigation {
            private const val version = "2.4.2"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:${version}"
            const val ui = "androidx.navigation:navigation-ui-ktx:${version}"
            const val saferArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${version}"
            const val compose = "androidx.navigation:navigation-compose:${version}"
        }

        object Paging2 {
            private const val version = "2.1.2"
            const val core = "androidx.paging:paging-runtime:${version}"
            const val common = "androidx.paging:paging-common:${version}"
        }

        object Paging3 {
            private const val version = "3.1.0"
            private const val composeVersion = "1.0.0-alpha14"
            const val core = "androidx.paging:paging-runtime:${version}"
            const val compose = "androidx.paging:paging-compose:${composeVersion}"
        }

        object Room {
            private const val version = "2.4.1"
            const val core = "androidx.room:room-runtime:${version}"
            const val compiler = "androidx.room:room-compiler:${version}"
            const val ktx = "androidx.room:room-ktx:${version}"
        }

        object ViewPager2 {
            private const val version = "1.1.0-beta01"
            const val core = "androidx.viewpager2:viewpager2:${version}"
        }

        object SwipeRefreshLayout {
            private const val version = "1.1.0"
            const val swipeRefreshLayout =
                "androidx.swiperefreshlayout:swiperefreshlayout:${version}"
        }
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val core = "com.squareup.retrofit2:retrofit:$version"
        const val converterJackson = "com.squareup.retrofit2:converter-jackson:$version"
        const val converterScalars = "com.squareup.retrofit2:converter-scalars:$version"
        const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava:$version"
    }

    object Flipper {
        private const val version = "0.150.0"
        private const val soloaderVersion = "0.10.1"
        const val core = "com.facebook.flipper:flipper:$version"
        const val network = "com.facebook.flipper:flipper-network-plugin:$version"
        const val noop = "com.facebook.flipper:flipper-noop:$version"
        const val soloader = "com.facebook.soloader:soloader:$soloaderVersion"
    }

    object Koin {
        private const val version = "3.1.6"
        const val core = "io.insert-koin:koin-core:$version"
        const val compose = "io.insert-koin:koin-androidx-compose:$version"
    }

    object Gson {
        private const val version = "2.8.5"
        const val core = "com.google.code.gson:gson:$version"
    }

    object Guava {
        private const val version = "25.0-android"
        const val core = "com.google.guava:guava:$version"
    }

    object Jackson {
        private const val version = "2.12.4"
        const val databind = "com.fasterxml.jackson.core:jackson-databind:${version}"
        const val kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${version}"
    }

    object JavaX {
        private const val version = "10.0-b28"
        const val annotation = "org.glassfish:javax.annotation:$version"
    }

    object Firebase {
        private const val version = "29.0.4"
        const val bom = "com.google.firebase:firebase-bom:${version}"

        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val config = "com.google.firebase:firebase-config-ktx"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    }

    object Google {
        private const val play_version = "1.10.0"
        const val play = "com.google.android.play:core:$play_version"
    }

    object MapStruct {
        private const val version = "1.4.2.Final"
        const val core = "org.mapstruct:mapstruct:$version"
        const val annotation = "org.mapstruct:mapstruct-processor:$version"
    }

    object Compose {
        private const val version = "1.2.0-beta02"
        private const val composeConstraintVersion = "1.0.0"
        const val ui = "androidx.compose.ui:ui:$version"
        const val uiTooling = "androidx.compose.ui:ui-tooling:$version"
        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val composeMaterial = "androidx.compose.material:material:$version"
        const val composeMaterialIcons = "androidx.compose.material:material-icons-core:$version"
        const val composeMaterialIconsExt = "androidx.compose.material:material-icons-extended:$version"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:$version"
        const val composeConstraint = "androidx.constraintlayout:constraintlayout-compose:$composeConstraintVersion"

        const val composeTest = "androidx.compose.ui:ui-test-junit4:$version"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
    }

    object Accompanist {
        private const val version = "0.23.1"
        const val swipeRefresh = "com.google.accompanist:accompanist-swiperefresh:$version"
        const val appCompatTheme = "com.google.accompanist:accompanist-appcompat-theme:$version"
    }

    object Landscapist {
        private const val version = "1.4.1"
        const val coil = "com.github.skydoves:landscapist-coil:$version"
    }

    object Shimmer {
        private const val version = "0.5.0"

        const val shimmer = "com.facebook.shimmer:shimmer:$version"
    }

    object Snapper {
        private const val version = "0.2.2"
        const val snapper = "dev.chrisbanes.snapper:snapper:$version"
    }

    object Coil {
        private const val version = "2.0.0"
        const val core = "io.coil-kt:coil:$version"
        const val compose = "io.coil-kt:coil-compose:$version"
    }

    object OkHttp {
        private const val version = "4.9.2"
        const val core = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object ExoPlayer {
        private const val version = "2.16.1"
        const val core = "com.google.android.exoplayer:exoplayer-core:$version"
        const val ui = "com.google.android.exoplayer:exoplayer-ui:$version"
        const val hls = "com.google.android.exoplayer:exoplayer-hls:$version"
        const val okhttp = "com.google.android.exoplayer:extension-okhttp:$version"
    }

    object DiskLruCache {
        private const val version = "2.0.2"
        const val core = "com.jakewharton:disklrucache:$version"
    }

    object RxJava {
        const val android = "io.reactivex:rxandroid:1.2.1"
        const val core = "io.reactivex:rxjava:1.3.0"
    }

    object Takt {
        private const val version = "2.1.1"
        const val core = "jp.wasabeef:takt:$version"
        const val noop = "jp.wasabeef:takt-no-op:$version"
    }

    object Timber {
        private const val version = "5.0.1"
        const val core = "com.jakewharton.timber:timber:$version"
    }

    object SQLDelightDB {
        private const val version = "1.5.3"
        const val plugin = "com.squareup.sqldelight:gradle-plugin:$version"
        const val android = "com.squareup.sqldelight:android-driver:$version"
        const val coroutines = "com.squareup.sqldelight:coroutines-extensions-jvm:$version"
    }
}
