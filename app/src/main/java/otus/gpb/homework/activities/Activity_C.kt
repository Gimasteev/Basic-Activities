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
        // Задание 2.4: Создаю новый активти и чищу весь стек. Вроде как сделано задание. Нажимаю назад и закрывается текущий таск, НО потом открываю трей и вижу, что оно есть))))
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or  Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun onClickListenerCloseCAndGoBack(view: View){
        val intent = Intent(this, Activity_B::class.java)
        // Задание 2.5: Финиширую активити С
        finish()
        //intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        //startActivity(intent)
    }

    fun onClickListenerCloseStackAndGoA(view: View){
        val intent = Intent(this, Activity_A::class.java)
        // Задание 2.5: Финиширую через функцию finishAffinity(), но опять-таки вижу в трее что висит активити С
        finishAffinity()
        //intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        //startActivity(intent)
    }

}