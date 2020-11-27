package mega.GRE.examination

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Launching : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launching)
        val timer: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(5000)
                } catch (ee: Exception) {
                    ee.printStackTrace()
                } finally {
                    val bol = Intent(this@Launching, Home::class.java)
                    startActivity(bol)
                    finish()
                }
            }
        }
        timer.start()
    }
}