package com.mehrdad.instagramstoryeffect.instagram.circle

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

//-------------------------------------------------------------------------------------------------- startAnimation
fun CoroutineScope.startAnimation(
    animatables: Array<Animatable<Float, AnimationVector1D>>,
    startDelayAmount: Long,
    startDuration: Int,
    endDuration: Int,
    waitDelay: Long
) {
    animatables.forEachIndexed { index, animatable ->
        launch {
            applyInstagramAnimation(
                animatable = animatable,
                index = index,
                startDelayAmount = startDelayAmount,
                startDuration = startDuration,
                endDuration = endDuration,
                waitDelay = waitDelay
            )
        }
    }
}
//-------------------------------------------------------------------------------------------------- startAnimation
