package com.jumi.proyectogalaxyapp.models


import com.jumi.proyectogalaxyapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)