package ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import model.Post
import coil.compose.AsyncImage

@Composable
fun PostCard(
    post: Post,
    onLikeClick: (Post) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // 1. Header
        PostHeader(post = post)

        // 2. Imagen principal
        AsyncImage(
            model = post.profileImageUrl,
            contentDescription = "Avatar de ${post.username}",
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        // 3. Acciones
        PostActions(
            post = post,
            onLikeClick = { onLikeClick(post) }
        )

        // 4. Footer
        PostFooter(post = post)

        Divider(color = Color.LightGray.copy(alpha = 0.3f))
    }
}
