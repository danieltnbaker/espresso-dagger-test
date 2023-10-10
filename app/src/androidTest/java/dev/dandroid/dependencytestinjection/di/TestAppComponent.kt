package dev.dandroid.dependencytestinjection.di

import dagger.Component
import dev.dandroid.dependencytestinjection.MainActivityTest
import javax.inject.Singleton

@Singleton
@Component(modules = [TestAppModule::class])
interface TestAppComponent : AppComponent {

    fun inject(activityTest: MainActivityTest)
}
