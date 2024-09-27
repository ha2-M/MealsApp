package com.hadeer.taskamit.di

import com.hadeer.data.network.mainscreen.JsonPlaceHolderApi
import com.hadeer.data.repo.MainScreenRepoImp
import com.hadeer.domain.repo.mainscreen.MainScreenRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideMainScreenRepo(
        api:JsonPlaceHolderApi
    ): MainScreenRepo {
        return MainScreenRepoImp(api)
    }


}