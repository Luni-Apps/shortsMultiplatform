//package design.designsystem.templates
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.aspectRatio
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.PlayArrow
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.geometry.Offset
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalInspectionMode
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import coil3.annotation.ExperimentalCoilApi
//import coil3.compose.AsyncImage
//import com.luni.android.shorts.components.spacer.HeightSpacer
//import com.luni.android.shorts.design.R
//import design.designsystem.AppTheme
//import design.designsystem.atoms.types.getDefaultFontFamily
//import com.luni.android.shorts.utils.color
//import com.luni.android.shorts.utils.removeFontPadding
//import com.luni.android.shorts.utils.shadow
//import com.luni.android.shorts.utils.size
//import com.luni.android.shorts.utils.weight
//
//enum class RankType {
//    Small,
//    Big
//}
//
//data class SerieCoverProgress(
//    val progress: Float,
//    val title: String
//)
//
//data class SerieCoverStyle(
//    val isNew: Boolean,
//    val rank: Int? = null,
//    val views: String? = null,
//    val image: String,
//    val progress: SerieCoverProgress? = null,
//    val rankType: RankType = RankType.Small
//)
//
//@Composable
//fun SerieCover(modifier: Modifier = Modifier, style: SerieCoverStyle) {
//    Box(modifier = modifier.aspectRatio(0.7f).clip(RoundedCornerShape(size = AppTheme.corners.Fixed.xSmall))) {
//        AsyncImage(
//            modifier = Modifier.fillMaxSize(),
//            model = style.image,
//            contentDescription = null,
//            contentScale = ContentScale.Crop)
//        if (LocalInspectionMode.current) {
//            Image(
//                painter = painterResource(id = R.drawable.placeholder_serie_cover),
//                contentDescription = null,
//                modifier = Modifier.fillMaxSize(),
//                contentScale = ContentScale.Crop
//            )
//        }
//        if (style.isNew) {
//            NewBadge(modifier = Modifier.align(Alignment.TopEnd))
//        }
//        style.rank?.let { rank ->
//            when (style.rankType) {
//                RankType.Small -> SmallRank(
//                    modifier = Modifier.align(Alignment.TopStart),
//                    rank = rank
//                )
//
//                RankType.Big -> BigRank(modifier = Modifier.align(Alignment.TopStart), rank = rank)
//            }
//        }
//        style.progress?.let { progress ->
//            Box(modifier = Modifier.align(Alignment.Center)
//                .size(48.dp)
//                .background(Color.White, shape = CircleShape).padding(3.dp)
//                .background(Color(0xff9C9C9C), shape = CircleShape)
//                .background(Color(0xff252525).copy(alpha = 0.55f), shape = CircleShape), contentAlignment = Alignment.Center){
//                    Icon(imageVector = Icons.Filled.PlayArrow, tint = AppTheme.colors.text.primary, contentDescription = null)
//                }
//            Progress(modifier = Modifier.align(Alignment.BottomStart).padding(4.dp), progress = progress)
//        }
//        style.views?.let {
//            Row(modifier = Modifier.align(Alignment.BottomEnd).padding(vertical = 4.dp, horizontal = 8.dp), verticalAlignment = Alignment.CenterVertically) {
//                Icon(imageVector = Icons.Filled.PlayArrow, tint = AppTheme.colors.text.primary, contentDescription = null)
//                Text(text = it, style = AppTheme.typography.callout.emphasized.color(AppTheme.colors.text.primary))
//            }
//        }
//    }
//}
//
//@Composable
//private fun Progress(modifier: Modifier = Modifier, progress: SerieCoverProgress) {
//    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
//        Text(
//            text = progress.title,
//            style = AppTheme.typography.caption.caption1.emphasized
//                .color(AppTheme.colors.text.primary)
//        )
//        HeightSpacer(height = 4.dp)
//        LinearProgressIndicator(
//            progress = { progress.progress },
//            modifier = Modifier
//                .fillMaxWidth()
//                .clip(CircleShape),
//            color = AppTheme.colors.surface.primary,
//            trackColor =  AppTheme.colors.surface.disabled
//        )
//    }
//}
//
//@Composable
//private fun SmallRank(modifier: Modifier = Modifier, rank: Int) {
//    Text(
//        modifier = modifier
//            .background(
//                AppTheme.colors.surface.backgroundPrimary
//            )
//            .padding(vertical = 7.dp, horizontal = 16.dp),
//        text = rank.toString(),
//        style = AppTheme.typography.title.title1.emphasized
//            .color(AppTheme.colors.text.primary)
//    )
//}
//
//
//@Composable
//private fun BigRank(modifier: Modifier = Modifier, rank: Int) {
//    Text(
//        modifier = modifier.padding(start = 8.dp),
//        text = rank.toString(),
//        style = defaultFontFamily
//            .weight(FontWeight.W700)
//            .size(64.sp)
//            .color(AppTheme.colors.text.primary)
//            .removeFontPadding()
//            .shadow(
//                Color.Black.copy(alpha = 0.04f),
//                blurRadius = 4f,
//                offset = Offset(x = 0f, y = 1f)
//            )
//    )
//}
//
//@Composable
//private fun NewBadge(modifier: Modifier = Modifier) {
//    Text(
//        modifier = modifier
//            .padding(2.dp)
//            .background(
//                AppTheme.colors.surface.primary,
//                shape = RoundedCornerShape(size = AppTheme.corners.Fixed.small)
//            ).padding(vertical = 4.dp, horizontal = 8.dp),
//        text = "New".uppercase(),
//        style = AppTheme.typography.caption.caption1.emphasized
//            .color(AppTheme.colors.text.primary)
//    )
//}
//
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewSerieCoverRanked() {
//    SerieCover(
//        modifier = Modifier.width(112.dp),
//        style = SerieCoverStyle(
//            isNew = false,
//            rank = 1,
//            views = "1M views",
//            image = SERIE_COVER_PREVIEW_URL,
//            progress = null
//        )
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewSerieCoverRankedBig() {
//    SerieCover(
//        modifier = Modifier.width(112.dp),
//        style = SerieCoverStyle(
//            isNew = false,
//            rank = 1,
//            views = "1M views",
//            image = SERIE_COVER_PREVIEW_URL,
//            progress = null,
//            rankType = RankType.Big
//        )
//    )
//}
//
//
//@OptIn(ExperimentalCoilApi::class)
//@Preview(showBackground = true)
//@Composable
//fun PreviewSerieCoverWithProgress() {
//
//    SerieCover(
//        modifier = Modifier.width(112.dp),
//        style = SerieCoverStyle(
//            isNew = true,
//            rank = null,
//            views = null,
//            image = SERIE_COVER_PREVIEW_URL,
//            progress = SerieCoverProgress(0.5f, "Episodes 12/24")
//        )
//    )
//}
//
//const val SERIE_COVER_PREVIEW_URL = ""