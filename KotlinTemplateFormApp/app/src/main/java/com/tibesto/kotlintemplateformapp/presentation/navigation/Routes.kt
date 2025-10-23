package com.tibesto.kotlintemplateformapp.presentation.navigation

sealed class DashboardRoutes(val route: String) {
    object Main : DashboardRoutes("dashboard/main")
    object Ledger : DashboardRoutes("dashboard/ledger")
    object Appointments : DashboardRoutes("dashboard/appointments")
    object Summary : DashboardRoutes("dashboard/summary")
}
