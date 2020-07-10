package com.qingmei2.sample.base

import android.app.Application
import com.facebook.stetho.Stetho
import com.qingmei2.architecture.core.logger.initLogger
import com.qingmei2.sample.BuildConfig
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        initLogger(BuildConfig.DEBUG)
        initStetho()
    }

    private fun initStetho() {
        Stetho.initializeWithDefaults(this)
    }

    companion object {
        lateinit var INSTANCE: BaseApplication
    }
}
