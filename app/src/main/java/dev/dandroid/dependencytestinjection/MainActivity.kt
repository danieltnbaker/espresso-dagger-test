package dev.dandroid.dependencytestinjection

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.dandroid.dependencytestinjection.data.DataProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dataProvider: DataProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (applicationContext as DiApplication).component.inject(this)

        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.app_text).text = dataProvider.text
    }
}
