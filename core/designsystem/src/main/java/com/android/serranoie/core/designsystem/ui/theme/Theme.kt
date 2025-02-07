package com.android.serranoie.core.designsystem.ui.theme

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.android.serranoie.app.theming.ui.theme.backgroundDark
import com.android.serranoie.app.theming.ui.theme.backgroundDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.backgroundDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.backgroundLight
import com.android.serranoie.app.theming.ui.theme.backgroundLightHighContrast
import com.android.serranoie.app.theming.ui.theme.backgroundLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.errorContainerDark
import com.android.serranoie.app.theming.ui.theme.errorContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.errorContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.errorContainerLight
import com.android.serranoie.app.theming.ui.theme.errorContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.errorContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.errorDark
import com.android.serranoie.app.theming.ui.theme.errorDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.errorDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.errorLight
import com.android.serranoie.app.theming.ui.theme.errorLightHighContrast
import com.android.serranoie.app.theming.ui.theme.errorLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.inverseOnSurfaceDark
import com.android.serranoie.app.theming.ui.theme.inverseOnSurfaceDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.inverseOnSurfaceLight
import com.android.serranoie.app.theming.ui.theme.inverseOnSurfaceLightHighContrast
import com.android.serranoie.app.theming.ui.theme.inverseOnSurfaceLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.inversePrimaryDark
import com.android.serranoie.app.theming.ui.theme.inversePrimaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.inversePrimaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.inversePrimaryLight
import com.android.serranoie.app.theming.ui.theme.inversePrimaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.inversePrimaryLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.inverseSurfaceDark
import com.android.serranoie.app.theming.ui.theme.inverseSurfaceDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.inverseSurfaceDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.inverseSurfaceLight
import com.android.serranoie.app.theming.ui.theme.inverseSurfaceLightHighContrast
import com.android.serranoie.app.theming.ui.theme.inverseSurfaceLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onBackgroundDark
import com.android.serranoie.app.theming.ui.theme.onBackgroundDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onBackgroundDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onBackgroundLight
import com.android.serranoie.app.theming.ui.theme.onBackgroundLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onBackgroundLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onErrorContainerDark
import com.android.serranoie.app.theming.ui.theme.onErrorContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onErrorContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onErrorContainerLight
import com.android.serranoie.app.theming.ui.theme.onErrorContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onErrorContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onErrorDark
import com.android.serranoie.app.theming.ui.theme.onErrorDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onErrorDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onErrorLight
import com.android.serranoie.app.theming.ui.theme.onErrorLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onErrorLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryContainerDark
import com.android.serranoie.app.theming.ui.theme.onPrimaryContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryContainerLight
import com.android.serranoie.app.theming.ui.theme.onPrimaryContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryDark
import com.android.serranoie.app.theming.ui.theme.onPrimaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryLight
import com.android.serranoie.app.theming.ui.theme.onPrimaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onPrimaryLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryContainerDark
import com.android.serranoie.app.theming.ui.theme.onSecondaryContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryContainerLight
import com.android.serranoie.app.theming.ui.theme.onSecondaryContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryDark
import com.android.serranoie.app.theming.ui.theme.onSecondaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryLight
import com.android.serranoie.app.theming.ui.theme.onSecondaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onSecondaryLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceDark
import com.android.serranoie.app.theming.ui.theme.onSurfaceDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceLight
import com.android.serranoie.app.theming.ui.theme.onSurfaceLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceVariantDark
import com.android.serranoie.app.theming.ui.theme.onSurfaceVariantDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceVariantDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceVariantLight
import com.android.serranoie.app.theming.ui.theme.onSurfaceVariantLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onSurfaceVariantLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryContainerDark
import com.android.serranoie.app.theming.ui.theme.onTertiaryContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryContainerLight
import com.android.serranoie.app.theming.ui.theme.onTertiaryContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryDark
import com.android.serranoie.app.theming.ui.theme.onTertiaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryLight
import com.android.serranoie.app.theming.ui.theme.onTertiaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.onTertiaryLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.outlineDark
import com.android.serranoie.app.theming.ui.theme.outlineDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.outlineDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.outlineLight
import com.android.serranoie.app.theming.ui.theme.outlineLightHighContrast
import com.android.serranoie.app.theming.ui.theme.outlineLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.outlineVariantDark
import com.android.serranoie.app.theming.ui.theme.outlineVariantDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.outlineVariantDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.outlineVariantLight
import com.android.serranoie.app.theming.ui.theme.outlineVariantLightHighContrast
import com.android.serranoie.app.theming.ui.theme.outlineVariantLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.primaryContainerDark
import com.android.serranoie.app.theming.ui.theme.primaryContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.primaryContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.primaryContainerLight
import com.android.serranoie.app.theming.ui.theme.primaryContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.primaryContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.primaryDark
import com.android.serranoie.app.theming.ui.theme.primaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.primaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.primaryLight
import com.android.serranoie.app.theming.ui.theme.primaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.primaryLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.scrimDark
import com.android.serranoie.app.theming.ui.theme.scrimDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.scrimDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.scrimLight
import com.android.serranoie.app.theming.ui.theme.scrimLightHighContrast
import com.android.serranoie.app.theming.ui.theme.scrimLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.secondaryContainerDark
import com.android.serranoie.app.theming.ui.theme.secondaryContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.secondaryContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.secondaryContainerLight
import com.android.serranoie.app.theming.ui.theme.secondaryContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.secondaryContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.secondaryDark
import com.android.serranoie.app.theming.ui.theme.secondaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.secondaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.secondaryLight
import com.android.serranoie.app.theming.ui.theme.secondaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.secondaryLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceBrightDark
import com.android.serranoie.app.theming.ui.theme.surfaceBrightDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceBrightDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceBrightLight
import com.android.serranoie.app.theming.ui.theme.surfaceBrightLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceBrightLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerDark
import com.android.serranoie.app.theming.ui.theme.surfaceContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighDark
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighLight
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighestDark
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighestDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighestLight
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighestLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerHighestLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLight
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowDark
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowLight
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowestDark
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowestDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowestLight
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowestLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceContainerLowestLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceDark
import com.android.serranoie.app.theming.ui.theme.surfaceDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceDimDark
import com.android.serranoie.app.theming.ui.theme.surfaceDimDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceDimDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceDimLight
import com.android.serranoie.app.theming.ui.theme.surfaceDimLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceDimLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceLight
import com.android.serranoie.app.theming.ui.theme.surfaceLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceVariantDark
import com.android.serranoie.app.theming.ui.theme.surfaceVariantDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceVariantDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.surfaceVariantLight
import com.android.serranoie.app.theming.ui.theme.surfaceVariantLightHighContrast
import com.android.serranoie.app.theming.ui.theme.surfaceVariantLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryContainerDark
import com.android.serranoie.app.theming.ui.theme.tertiaryContainerDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryContainerDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryContainerLight
import com.android.serranoie.app.theming.ui.theme.tertiaryContainerLightHighContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryContainerLightMediumContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryDark
import com.android.serranoie.app.theming.ui.theme.tertiaryDarkHighContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryDarkMediumContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryLight
import com.android.serranoie.app.theming.ui.theme.tertiaryLightHighContrast
import com.android.serranoie.app.theming.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

/**
 * Traveler Companion theme.
 *
 * @param darkTheme Whether the theme should use a dark color scheme (follows system by default).
 * @param disableDynamicTheming If `true`, disables the use of dynamic theming, even when it is
 *        supported.
 */
@Composable
fun TravelerCompanionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    disableDynamicTheming: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        disableDynamicTheming && supportsDynamicTheming() -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
fun supportsDynamicTheming() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S