package com.mehrdad.instagramstoryeffect.instagram.circle

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mehrdad.instagramstoryeffect.InstagramEffect

//-------------------------------------------------------------------------------------------------- CircleInstagramAnimationButton
@Composable
fun CircleInstagramAnimationButton(
    modifier: Modifier,
    isAnimate: Boolean,
    strokeWidth: Dp,
    strokeStartColor: Color,
    strokeEndColor: Color,
    onClickButton: () -> Unit,
    buttonLabel: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background,
        shape = CircleShape
    ) {
        val effectPadding = strokeWidth + 2.dp
        val buttonPadding = effectPadding + (strokeWidth * 85 / 100)
        if (isAnimate)
            InstagramEffect(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(effectPadding),
                strokeWidth = strokeWidth,
                strokeStartColor = strokeStartColor,
                strokeEndColor = strokeEndColor
            )
        Button(
            modifier = Modifier.padding(buttonPadding),
            onClick = {
                onClickButton.invoke()
            }) {
            buttonLabel()
        }
    }
}
//-------------------------------------------------------------------------------------------------- CircleInstagramAnimationButton
