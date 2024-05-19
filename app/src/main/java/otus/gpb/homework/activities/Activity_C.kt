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

    override fun onResume() {
        super.onResume()
        Log.d("Debug", "onResumeC")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Debug", "onDestroyC")
    }
    fun onClickListenerOpenAfromC(view: View) { // создаем функцию и указываем переменную view типа View (!)
        if (view is Button) {
            // Создаем Intent для открытия другого Activity
            val intent = Intent(this, Activity_A::class.java)
            // Начинаем новое Activity
            startActivity(intent)
        }
    }

    fun onClickListenerOpenDfromC(view: View){
        val intent = Intent(this, Activity_D::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun onClickListenerCloseCAndStack(view: View){
        val intent = Intent(this, Activity_B::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }

    fun onClickListenerCloseStackAndGoA(view: View){
        val intent = Intent(this, Activity_A::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

}