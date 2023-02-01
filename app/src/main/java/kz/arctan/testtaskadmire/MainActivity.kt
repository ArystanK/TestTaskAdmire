package kz.arctan.testtaskadmire

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import kz.arctan.testtaskadmire.ui.theme.TestTaskAdmireTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTaskAdmireTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LottieAnimationView()
                }
            }
        }
    }
}

@Composable
fun LottieAnimationView() {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.typing_animation))
    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever
    )

}
