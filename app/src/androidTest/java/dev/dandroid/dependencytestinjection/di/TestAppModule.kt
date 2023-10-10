package dev.dandroid.dependencytestinjection.di

import dagger.Module
import dagger.Provides
import dev.dandroid.dependencytestinjection.data.DataProvider
import dev.dandroid.dependencytestinjection.data.TestDataProvider
import javax.inject.Singleton

@Module
class TestAppModule {

    @Provides
    @Singleton
    fun provideDataProvider(): DataProvider = TestDataProvider()
}
