package fi.oamk.themingwalkthrough.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Nord9,
    primaryVariant = Nord8,
    secondary = Nord7,
    background = Nord1,
    onPrimary = Nord1,
    onSecondary = Nord1,
    onBackground = Nord5
)

private val LightColorPalette = lightColors(
    primary = Nord8,
    primaryVariant = Nord9,
    secondary = Nord7,
    background = Nord5,
    onPrimary = Nord5,
    onSecondary = Nord5,
    onBackground = Nord1

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ThemingWalkthroughTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}