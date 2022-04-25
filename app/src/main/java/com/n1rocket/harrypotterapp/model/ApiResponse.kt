package com.n1rocket.harrypotterapp.model

data class ApiResponse(
    val results: List<CharacterResponse> = emptyList()
)

data class CharacterResponse(
    val name: String?,
    val photo: String?
)
