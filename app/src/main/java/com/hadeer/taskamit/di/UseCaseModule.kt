package com.hadeer.taskamit.di

import com.hadeer.domain.repo.mainscreen.MainScreenRepo
import com.hadeer.domain.usecase.mainscreen.GetPosts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    //Main
    @Provides
    fun provideGetPsostUseCase(mainRepo: MainScreenRepo): GetPosts {
        return GetPosts(mainRepo)
    }

}