package dev.dandroid.dependencytestinjection.runner

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import dev.dandroid.dependencytestinjection.TestDiApplication

class TestRunner : AndroidJUnitRunner() {

    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application {
        return super.newApplication(cl, TestDiApplication::class.java.name, context)
    }
}
