package com.android.serranoie.app_theming.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.serranoie.core.theming.component.NiaButton
import com.android.serranoie.core.theming.component.NiaFilterChip
import com.android.serranoie.core.theming.component.NiaIconToggleButton
import com.android.serranoie.core.theming.component.NiaNavigationBar
import com.android.serranoie.core.theming.component.NiaNavigationBarItem
import com.android.serranoie.core.theming.component.NiaOutlinedButton
import com.android.serranoie.core.theming.component.NiaTab
import com.android.serranoie.core.theming.component.NiaTabRow
import com.android.serranoie.core.theming.component.NiaTextButton
import com.android.serranoie.core.theming.component.NiaTopicTag
import com.android.serranoie.core.theming.component.NiaViewToggleButton
import com.android.serranoie.travelercompanion.ui.theme.TravelerCompanionTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Catalog() {
    TravelerCompanionTheme {
        Surface {
            val contentPadding = WindowInsets
                .systemBars
                .add(WindowInsets(left = 16.dp, top = 16.dp, right = 16.dp, bottom = 16.dp))
                .asPaddingValues()
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = contentPadding,
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                item {
                    Text(
                        text = "Catalog",
                        style = MaterialTheme.typography.headlineSmall,
                    )
                }
                item { Text("Buttons", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        NiaButton(onClick = {}) {
                            Text(text = "Enabled")
                        }
                        NiaOutlinedButton(onClick = {}) {
                            Text(text = "Enabled")
                        }
                        NiaTextButton(onClick = {}) {
                            Text(text = "Enabled")
                        }
                    }
                }
                item { Text("Disabled buttons", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        NiaButton(
                            onClick = {},
                            enabled = false,
                        ) {
                            Text(text = "Disabled")
                        }
                        NiaOutlinedButton(
                            onClick = {},
                            enabled = false,
                        ) {
                            Text(text = "Disabled")
                        }
                        NiaTextButton(
                            onClick = {},
                            enabled = false,
                        ) {
                            Text(text = "Disabled")
                        }
                    }
                }
                item { Text("Buttons with leading icons", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        NiaButton(
                            onClick = {},
                            text = { Text(text = "Enabled") },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.Home, contentDescription = null)
                            },
                        )
                        NiaOutlinedButton(
                            onClick = {},
                            text = { Text(text = "Enabled") },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.Home, contentDescription = null)
                            },
                        )
                        NiaTextButton(
                            onClick = {},
                            text = { Text(text = "Enabled") },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.Home, contentDescription = null)
                            },
                        )
                    }
                }
                item { Text("Disabled buttons with leading icons", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        NiaButton(
                            onClick = {},
                            enabled = false,
                            text = { Text(text = "Disabled") },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.Home, contentDescription = null)
                            },
                        )
                        NiaOutlinedButton(
                            onClick = {},
                            enabled = false,
                            text = { Text(text = "Disabled") },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.Home, contentDescription = null)
                            },
                        )
                        NiaTextButton(
                            onClick = {},
                            enabled = false,
                            text = { Text(text = "Disabled") },
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Add, contentDescription = null)
                            },
                        )
                    }
                }
                item { Text("Dropdown menus", Modifier.padding(top = 16.dp)) }
                item { Text("Chips", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        var firstChecked by rememberSaveable { mutableStateOf(false) }
                        NiaFilterChip(
                            selected = firstChecked,
                            onSelectedChange = { checked -> firstChecked = checked },
                            label = { Text(text = "Enabled") },
                        )
                        var secondChecked by rememberSaveable { mutableStateOf(true) }
                        NiaFilterChip(
                            selected = secondChecked,
                            onSelectedChange = { checked -> secondChecked = checked },
                            label = { Text(text = "Enabled") },
                        )
                        NiaFilterChip(
                            selected = false,
                            onSelectedChange = {},
                            enabled = false,
                            label = { Text(text = "Disabled") },
                        )
                        NiaFilterChip(
                            selected = true,
                            onSelectedChange = {},
                            enabled = false,
                            label = { Text(text = "Disabled") },
                        )
                    }
                }
                item { Text("Icon buttons", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        var firstChecked by rememberSaveable { mutableStateOf(false) }
                        NiaIconToggleButton(
                            checked = firstChecked,
                            onCheckedChange = { checked -> firstChecked = checked },
                            icon = {
                                Icon(
                                    imageVector = Icons.Rounded.Build,
                                    contentDescription = null,
                                )
                            },
                            checkedIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Build,
                                    contentDescription = null,
                                )
                            },
                        )
                        var secondChecked by rememberSaveable { mutableStateOf(true) }
                        NiaIconToggleButton(
                            checked = secondChecked,
                            onCheckedChange = { checked -> secondChecked = checked },
                            icon = {
                                Icon(
                                    imageVector = Icons.Rounded.Build,
                                    contentDescription = null,
                                )
                            },
                            checkedIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Build,
                                    contentDescription = null,
                                )
                            },
                        )
                        NiaIconToggleButton(
                            checked = false,
                            onCheckedChange = {},
                            icon = {
                                Icon(
                                    imageVector = Icons.Rounded.Build,
                                    contentDescription = null,
                                )
                            },
                            checkedIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Build,
                                    contentDescription = null,
                                )
                            },
                            enabled = false,
                        )
                        NiaIconToggleButton(
                            checked = true,
                            onCheckedChange = {},
                            icon = {
                                Icon(
                                    imageVector = Icons.Rounded.Build,
                                    contentDescription = null,
                                )
                            },
                            checkedIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Build,
                                    contentDescription = null,
                                )
                            },
                            enabled = false,
                        )
                    }
                }
                item { Text("View toggle", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        var firstExpanded by rememberSaveable { mutableStateOf(false) }
                        NiaViewToggleButton(
                            expanded = firstExpanded,
                            onExpandedChange = { expanded -> firstExpanded = expanded },
                            compactText = { Text(text = "Compact view") },
                            expandedText = { Text(text = "Expanded view") },
                        )
                        var secondExpanded by rememberSaveable { mutableStateOf(true) }
                        NiaViewToggleButton(
                            expanded = secondExpanded,
                            onExpandedChange = { expanded -> secondExpanded = expanded },
                            compactText = { Text(text = "Compact view") },
                            expandedText = { Text(text = "Expanded view") },
                        )
                        NiaViewToggleButton(
                            expanded = false,
                            onExpandedChange = {},
                            compactText = { Text(text = "Disabled") },
                            expandedText = { Text(text = "Disabled") },
                            enabled = false,
                        )
                    }
                }
                item { Text("Tags", Modifier.padding(top = 16.dp)) }
                item {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        NiaTopicTag(
                            followed = true,
                            onClick = {},
                            text = { Text(text = "Topic 1".uppercase()) },
                        )
                        NiaTopicTag(
                            followed = false,
                            onClick = {},
                            text = { Text(text = "Topic 2".uppercase()) },
                        )
                        NiaTopicTag(
                            followed = false,
                            onClick = {},
                            text = { Text(text = "Disabled".uppercase()) },
                            enabled = false,
                        )
                    }
                }
                item { Text("Tabs", Modifier.padding(top = 16.dp)) }
                item {
                    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
                    val titles = listOf("Topics", "People")
                    NiaTabRow(selectedTabIndex = selectedTabIndex) {
                        titles.forEachIndexed { index, title ->
                            NiaTab(
                                selected = selectedTabIndex == index,
                                onClick = { selectedTabIndex = index },
                                text = { Text(text = title) },
                            )
                        }
                    }
                }
                item { Text("Navigation", Modifier.padding(top = 16.dp)) }
                item {
                    var selectedItem by rememberSaveable { mutableIntStateOf(0) }
                    val items = listOf("For you", "Saved", "Interests")
                    val icons = listOf(
                        Icons.Rounded.Check,
                        Icons.Rounded.Check,
                        Icons.Rounded.Check,
                    )
                    val selectedIcons = listOf(
                        Icons.Rounded.Settings,
                        Icons.Rounded.Settings,
                        Icons.Rounded.Settings,
                    )
                    NiaNavigationBar {
                        items.forEachIndexed { index, item ->
                            NiaNavigationBarItem(
                                icon = {
                                    Icon(
                                        imageVector = icons[index],
                                        contentDescription = item,
                                    )
                                },
                                selectedIcon = {
                                    Icon(
                                        imageVector = selectedIcons[index],
                                        contentDescription = item,
                                    )
                                },
                                label = { Text(item) },
                                selected = selectedItem == index,
                                onClick = { selectedItem = index },
                            )
                        }
                    }
                }
            }
        }
    }
}
