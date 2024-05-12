package otus.gpb.homework.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Activity_A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        val button = findViewById<Button>(R.id.buttonA_to_B)
        Log.d("Debug", "onCreateA")
        }
    fun onClickListener(view: View){ // создаем функцию и указываем переменную view типа View (!)
        if (view is Button) {
            // Создаем Intent для открытия другого Activity
            val intent = Intent(this, Activity_B::class.java)
            // Начинаем новое Activity
            startActivity(intent)
        }
    }
}