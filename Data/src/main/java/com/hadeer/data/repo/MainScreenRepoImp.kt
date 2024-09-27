package com.hadeer.data.repo

import com.hadeer.data.network.mainscreen.JsonPlaceHolderApi
import com.hadeer.domain.entity.PostModelResponseItem
import com.hadeer.domain.repo.mainscreen.MainScreenRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainScreenRepoImp constructor(private val api: JsonPlaceHolderApi) : MainScreenRepo {
    override suspend fun getPosts(): List<PostModelResponseItem> = withContext(Dispatchers.IO) {
        return@withContext api.getPosts()
    }
}