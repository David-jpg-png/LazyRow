package model

data class Post(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val imageUrl: String,
    val likes: Int,
    val caption: String,
    val isLiked: Boolean = false // valor por defecto
)

data class Story(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val hasSeen: Boolean = false // valor por defecto
)