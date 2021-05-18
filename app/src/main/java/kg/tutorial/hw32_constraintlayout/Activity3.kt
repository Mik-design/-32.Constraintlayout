package kg.tutorial.hw32_constraintlayout

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity3: AppCompatActivity() {
    lateinit var textView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        textView3 = findViewById(R.id.textView3)

      var textFromIntent = intent.getStringExtra("String")
        textView3.text = textFromIntent//puting data from mainactivity to third activity
    }
}