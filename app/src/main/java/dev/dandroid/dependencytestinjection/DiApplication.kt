package dev.dandroid.dependencytestinjection

import android.app.Application
import dev.dandroid.dependencytestinjection.di.AppComponent
import dev.dandroid.dependencytestinjection.di.DaggerAppComponent

open class DiApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }
}