package data

import model.Post
import model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1204,
            caption = "Explorando Jetpack Compose #Android #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 3456,
            caption = "Material3 + Compose = perfecta combinación"
        )
        // 👉 agrega más posts (hasta el 10) siguiendo el mismo patrón
    )

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia", "", hasSeen = false),
        Story(2, "android_dev", "https://picsum.photos/seed/s2/200/200"),
        Story(3, "kotlin_fan", "https://picsum.photos/seed/s3/200/200"),
        Story(4, "google_io", "https://picsum.photos/seed/s4/200/200", hasSeen = true)
        // 👉 agrega más stories (ids 5, 6, 7) con tus propios usernames
    )
}