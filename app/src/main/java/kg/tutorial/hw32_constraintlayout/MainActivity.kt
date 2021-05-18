package kg.tutorial.hw32_constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var edit_text: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         button = findViewById(R.id.button)
        setUpView()
    }

    private fun setUpView() {
        button.setOnClickListener {
            edit_text = findViewById<EditText>(R.id.edit_text)
            var text = edit_text.text.toString()
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra("String", text)
            startActivity(intent)
        }
    }

}
