package com.vm.tasksquare.feature_task.presentation.task_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TaskListScreen(
    onNavigateToAddTaskScreen: () -> Unit,
    onNavigateToViewEditTaskScreen: (Int) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onNavigateToAddTaskScreen) {
            Text(text = "Go to Add Task Screen")
        }
        Button(onClick = { onNavigateToViewEditTaskScreen(1) }) {
            Text(text = "Go to Edit Task Screen")
        }
    }
}