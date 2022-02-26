package jp.kaleidot725.sample.ui.navigation

sealed class Screen(val route: String, val title: String) {
    object Home : Screen(
        route = "home",
        title = "HOME"
    )

    object LaunchedEffectCounter : Screen(
        route = "launchedEffectCounter",
        title = "Launched Effect Sample (Counter)"
    )

    object LaunchedEffectToggle : Screen(
        route = "launchedEffectToggle",
        title = "Launched Effect Sample (Toggle)"
    )

    object DisposableEffect : Screen(
        route = "disposableEffect",
        title = "Disposable Effect Sample"
    )

    object RememberCoroutineScope : Screen(
        route = "rememberCoroutineScope",
        title = "Remember Coroutine Scope Sample"
    )

    object RememberUpdateState: Screen(
        route = "rememberUpdateState",
        title = "Remember Update State Sample"
    )

    object SideEffect: Screen (
        route = "sideEffect",
        title = "Side Effect Sample"
    )

    object DerivedStateOfSample: Screen(
        route = "derivedStateOf",
        title = "Derived State Of Sample"
    )

    object SnapshotFlowSample: Screen(
        route = "snapshotFlow",
        title = "Snapshot Flow Sample"
    )

    companion object {
        val SAMPLE_SCREENS = listOf(
            LaunchedEffectCounter,
            LaunchedEffectToggle,
            DisposableEffect,
            RememberCoroutineScope,
            RememberUpdateState,
            SideEffect,
            DerivedStateOfSample,
            SnapshotFlowSample
        )
    }
}