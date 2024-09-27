package com.hadeer.domain.usecase.mainscreen

import com.hadeer.domain.repo.mainscreen.MainScreenRepo

class GetPosts (private val mainScreenRepo: MainScreenRepo) {
    operator suspend fun invoke() = mainScreenRepo.getPosts()
}