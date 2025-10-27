package com.tibesto.kotlintemplateformapp.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
// recyclerView.layoutManager = LinearLayoutManager(context)
LazyColumn(Modifier.fillMaxSize())
@Composable
fun ListItem(data: MyData, modifier: Modifier = Modifier) {
    val data = listOf<MyData>(/* ... */)
    Row(modifier.fillMaxWidth()) {
        Text(text = data.name)
        // … other composables required for displaying `data`
        itemsIndexed(data) { index, d ->
            ListItem(d)
            if (index != data.size - 1) {
                HorizontalDivider()
            }
            LazyColumn {
                // Add a single item
                item {
                    Text(text = "First item")
                }

                // Add 5 items
                items(5) { index ->
                    Text(text = "Item: $index")
                }

                // Add another single item
                item {
                    Text(text = "Last item")
                }
            }
        }
    }
    }

private fun RowScope.itemsIndexed(values: Any, function: @Composable Any) {}
}