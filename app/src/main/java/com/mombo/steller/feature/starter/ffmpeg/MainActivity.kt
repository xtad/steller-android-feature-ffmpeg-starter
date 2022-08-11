package com.mombo.steller.feature.starter.ffmpeg

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mombo.steller.feature.ffmpeg.domain.FFmpegController
import com.mombo.steller.feature.starter.ffmpeg.ui.theme.FFmpegTheme
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val ffmpegController: FFmpegController by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FFmpegTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }

        try {
            val inputImage = "$filesDir/images/image_to_be_placed_into_video.png"
            val outputFile = "$filesDir/images/out.mp4"

            ffmpegController.execute(
                "-loop 1 -i " + inputImage + " -f lavfi -t 00:00:05 -i anullsrc -c:v mpeg4 -t 00:00:05 " +
                        "-b:v 500000 -tune stillimage -vf fps=1 -map 1:a -map 0:v " + outputFile
            )
        } catch (ex: Error) {
            Toast.makeText(this, "Error happened, probably FFmpeg was not found!", Toast.LENGTH_LONG).show()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FFmpegTheme {
        Greeting("Android")
    }
}