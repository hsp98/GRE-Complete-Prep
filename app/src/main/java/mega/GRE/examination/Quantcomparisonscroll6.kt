package mega.GRE.examination

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Quantcomparisonscroll6 : AppCompatActivity() {
    var rg: RadioGroup? = null
    var tv1: TextView? = null
    var tv2: TextView? = null
    var tv3: TextView? = null
    var inte: Intent? = null
    var a = 0
    var b = 0
    var sum = 0
    var btn: Button? = null
    var value = 0
    var value1 = 0
    var value2 = 0
    var value3 = 0
    var clicked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quantcomparisonscroll6)
        rg = findViewById(R.id.r6)
        tv1 = findViewById(R.id.textView115)
        tv2 = findViewById(R.id.textView116)
        tv3 = findViewById(R.id.textView117)
        btn = findViewById(R.id.button106)
        btn?.setOnClickListener(View.OnClickListener {
            clicked = true
            val ids = rg?.getCheckedRadioButtonId()
            when (ids) {
                R.id.radioButton21 -> {
                    value = 0
                    val num = Scorescollection()
                   inte = intent
                    a = inte?.getIntExtra("val5", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b
                    val send = Intent(this@Quantcomparisonscroll6, Quantcomparisonscroll7::class.java)
                    send.putExtra("val6", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton22 -> {
                    val value = 0
                    val num4 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val5", 0)!!
                    b = num4.calculatescore1(value)
                    sum = a + b
                    val send1 = Intent(this@Quantcomparisonscroll6, Quantcomparisonscroll7::class.java)
                    send1.putExtra("val6", sum)
                    startActivity(send1)
                    finish()
                }
                R.id.radioButton23 -> {
                    value = 0
                    val num2 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val5", 0)!!
                    b = num2.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@Quantcomparisonscroll6, Quantcomparisonscroll7::class.java)
                    send2.putExtra("val6", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton24 -> {
                    value = 1
                    val num6 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val5", 0)!!
                    b = num6.calculatescore1(value)
                    sum = a + b
                    val send8 = Intent(this@Quantcomparisonscroll6, Quantcomparisonscroll7::class.java)
                    send8.putExtra("val6", sum)
                    startActivity(send8)
                    finish()
                }
            }
        })
        rg?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            if (R.id.radioButton21 == checkedId) {
                value = 0
            } else if (R.id.radioButton22 == checkedId) {
                value1 = 0
            } else if (R.id.radioButton23 == checkedId) {
                value2 = 0
            } else if (R.id.radioButton24 == checkedId) {
                value3 = 1
            }
        })
        val timer: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(300000)
                } catch (ee: Exception) {
                    ee.printStackTrace()
                } finally {
                    if (clicked) {
                    } else {
                        val bol = Intent(this@Quantcomparisonscroll6, Times::class.java)
                        val v = 0
                        bol.putExtra("thread", v)
                        startActivity(bol)
                        finish()
                    }
                }
            }
        }
        timer.start()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    protected fun exitByBackKey() {
        val make = AlertDialog.Builder(this@Quantcomparisonscroll6)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}