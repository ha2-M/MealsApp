package com.hadeer.domain.repo.mainscreen

import com.hadeer.domain.entity.PostModelResponseItem

interface MainScreenRepo {

    suspend fun getPosts(): List<PostModelResponseItem>
}