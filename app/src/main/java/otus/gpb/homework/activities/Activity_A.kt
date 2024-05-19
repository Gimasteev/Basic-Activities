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

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Debug", "onDestroyA")
    }
    fun onClickListener(view: View){ // создаем функцию и указываем переменную view типа View (!)
        if (view is Button) {
            // Создаем Intent для открытия другого Activity
            val intent = Intent(this, Activity_B::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            // Начинаем новое Activity
            startActivity(intent)
        }

    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Debug", "onRestart")
        val intent = Intent(this, Activity_A::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
        Log.d("Debug", "onNewIntent")
    }

}