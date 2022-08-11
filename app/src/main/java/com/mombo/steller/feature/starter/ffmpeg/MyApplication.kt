package com.mombo.steller.feature.starter.ffmpeg

import android.app.Application
import app.artyomd.injector.DexUtils
import com.mombo.steller.feature.ffmpeg.featureFFmpegModules
import org.koin.core.context.startKoin
import java.io.File

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val dexPath = File("$filesDir/dex", "ffmpegkit.zip")
        if (!dexPath.exists()) {
            DexUtils.prepareDex(applicationContext, dexPath, "ffmpegkit.zip")
        }

        val dexs: MutableList<File> = ArrayList()
        dexs.add(dexPath)
        try {
            DexUtils.loadDex(applicationContext, dexs)
        } catch (e: Exception) {
            e.printStackTrace()
        }


        startKoin {
            modules(
                featureFFmpegModules
            )
        }
    }

}