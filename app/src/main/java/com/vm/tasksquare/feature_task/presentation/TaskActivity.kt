package com.vm.tasksquare.feature_task.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vm.tasksquare.feature_task.presentation.add_task.AddTaskScreen
import com.vm.tasksquare.feature_task.presentation.task_list.TaskListScreen
import com.vm.tasksquare.feature_task.presentation.view_edit_task.ViewEditTaskScreen
import com.vm.tasksquare.ui.theme.TaskSquareTheme
import kotlinx.serialization.Serializable


class TaskActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskSquareTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = TaskList
                ) {
                    composable<TaskList> {
                        TaskListScreen(
                            onNavigateToAddTaskScreen = { navController.navigate(AddTask) },
                            onNavigateToViewEditTaskScreen = { navController.navigate(ViewEditTask) }
                        )
                    }
                    composable<AddTask> {
                        AddTaskScreen(
                            onNavigateUp = { navController.navigateUp() }
                        )
                    }
                    composable<ViewEditTask> {
                        ViewEditTaskScreen(
                            onNavigateUp = { navController.navigateUp() }
                        )
                    }

                }
            }
        }
    }

    @Serializable
    object TaskList

    @Serializable
    object AddTask

    @Serializable
    object ViewEditTask
}
