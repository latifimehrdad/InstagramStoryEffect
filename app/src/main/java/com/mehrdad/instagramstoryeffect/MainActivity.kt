package com.mehrdad.instagramstoryeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mehrdad.instagramstoryeffect.instagram.circle.CircleInstagramAnimationButton
import com.mehrdad.instagramstoryeffect.ui.theme.InstagramStoryEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramStoryEffectTheme {
                // A surface container using the 'background' color from the theme
                val isAnimate = remember {
                    mutableStateOf(false)
                }

                CircleInstagramAnimationButton(
                    modifier = Modifier.size(150.dp),
                    isAnimate = isAnimate.value,
                    strokeWidth = 5.dp,
                    strokeStartColor = Color(0xffa52c9d),
                    strokeEndColor = Color(0xfff7c269),
                    onClickButton = {
                        isAnimate.value = !isAnimate.value
                    }
                ) {
                    Text(
                        text = "Click me ...",
                        color = Color.Black
                    )
                }

            }
        }
    }
}

