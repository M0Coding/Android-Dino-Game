import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.mocoding.dinogame.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
