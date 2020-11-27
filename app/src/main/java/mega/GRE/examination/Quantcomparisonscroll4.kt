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

class Quantcomparisonscroll4 : AppCompatActivity() {
    var rg: RadioGroup? = null
    var tv1: TextView? = null
    var tv2: TextView? = null
    var tv3: TextView? = null
    var btn: Button? = null
    var inte: Intent? = null
    var a = 0
    var b = 0
    var sum = 0
    var value = 0
    var value1 = 0
    var value2 = 0
    var value3 = 0
    var clicked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quantcomparisonscroll4)
        rg = findViewById(R.id.r4)
        tv1 = findViewById(R.id.textView109)
        tv2 = findViewById(R.id.textView110)
        tv3 = findViewById(R.id.textView111)
        btn = findViewById(R.id.button104)
        btn?.setOnClickListener(View.OnClickListener {
            clicked = true
            val ids = rg?.getCheckedRadioButtonId()
            when (ids) {
                R.id.radioButton13 -> {
                    value = 0
                    val num = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b
                    val send = Intent(this@Quantcomparisonscroll4, Quantcomparisonscroll5::class.java)
                    send.putExtra("val4", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton14 -> {
                    val value = 0
                    val num4 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num4.calculatescore1(value)
                    sum = a + b
                    val send1 = Intent(this@Quantcomparisonscroll4, Quantcomparisonscroll5::class.java)
                    send1.putExtra("val4", sum)
                    startActivity(send1)
                    finish()
                }
                R.id.radioButton15 -> {
                    value = 0
                    val num2 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num2.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@Quantcomparisonscroll4, Quantcomparisonscroll5::class.java)
                    send2.putExtra("val4", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton16 -> {
                    value = 1
                    val num6 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num6.calculatescore1(value)
                    sum = a + b
                    val send8 = Intent(this@Quantcomparisonscroll4, Quantcomparisonscroll5::class.java)
                    send8.putExtra("val4", sum)
                    startActivity(send8)
                    finish()
                }
            }
        })
        rg?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            if (R.id.radioButton13 == checkedId) {
                value = 0
            } else if (R.id.radioButton14 == checkedId) {
                value1 = 0
            } else if (R.id.radioButton15 == checkedId) {
                value2 = 0
            } else if (R.id.radioButton16 == checkedId) {
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
                        val bol = Intent(this@Quantcomparisonscroll4, Times::class.java)
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
        val make = AlertDialog.Builder(this@Quantcomparisonscroll4)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}