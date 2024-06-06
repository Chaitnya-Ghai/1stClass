package cg.tutorials.example.a1stclass

import android.os.Bundle
import android.view.Surface
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    var name : EditText?=null
    var city : EditText?=null
    var  CollageName: EditText?=null
    var check : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.UrName)
        city = findViewById(R.id.UrCity)
        CollageName = findViewById(R.id.UrCollage)
        check = findViewById(R.id.check)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        check?.setOnClickListener{
            Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        }
    }
}