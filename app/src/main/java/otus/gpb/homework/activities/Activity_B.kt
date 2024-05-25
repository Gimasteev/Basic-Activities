package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Activity_B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val button = findViewById<Button>(R.id.buttonB_to_C)
        Log.d("Debug", "onCreateB")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Debug", "onDestroyB")
    }
    fun onClickListener(view: View){ // создаем функцию и указываем переменную view типа View (!)
        if (view is Button) {
            Log.d("Debug", "openB")
            // // Задание 2.2: Создаем Intent для открытия другого Activity
            val intent = Intent(this, Activity_C::class.java)
            // Начинаем новое Activity
            startActivity(intent)
        }
    }
}