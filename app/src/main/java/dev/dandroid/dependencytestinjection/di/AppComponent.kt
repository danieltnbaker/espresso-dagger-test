package dev.dandroid.dependencytestinjection.di

import dagger.Component
import dev.dandroid.dependencytestinjection.MainActivity

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}