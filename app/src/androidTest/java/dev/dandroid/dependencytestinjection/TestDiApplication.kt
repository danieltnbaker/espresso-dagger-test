package dev.dandroid.dependencytestinjection

import dev.dandroid.dependencytestinjection.di.DaggerTestAppComponent

class TestDiApplication : DiApplication() {

    override fun onCreate() {
        super.onCreate()

        component = DaggerTestAppComponent.create()
    }
}
