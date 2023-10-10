package dev.dandroid.dependencytestinjection.di

import dagger.Module
import dagger.Provides
import dev.dandroid.dependencytestinjection.data.DataProvider

@Module
open class AppModule {

    @Provides
    fun provideDataProvider() = DataProvider()
}
