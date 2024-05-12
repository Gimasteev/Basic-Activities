package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Activity_C : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        val button = findViewById<Button>(R.id.buttonC_to_A)
        Log.d("Debug", "onCreateC")
    }

    fun onClickListener(view: View) { // создаем функцию и указываем переменную view типа View (!)
        if (view is Button) {
            // Создаем Intent для открытия другого Activity
            val intent = Intent(this, Activity_A::class.java)
            // Начинаем новое Activity
            startActivity(intent)
        }
    }

}