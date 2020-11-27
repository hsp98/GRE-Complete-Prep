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

class Quantcomparisonscroll2 : AppCompatActivity() {
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
        setContentView(R.layout.quantcomparisonscroll2)
        rg = findViewById(R.id.r2)
        tv1 = findViewById(R.id.textView103)
        tv2 = findViewById(R.id.textView104)
        tv3 = findViewById(R.id.textView105)
        btn = findViewById(R.id.button102)
        btn?.setOnClickListener(View.OnClickListener {
            clicked = true
            val ids = rg?.getCheckedRadioButtonId()
            when (ids) {
                R.id.radioButton5 -> {
                    value = 0

                    val num = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val1", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b
                    val send = Intent(this@Quantcomparisonscroll2, Quantcomparisonscroll3::class.java)
                    send.putExtra("val2", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton6 -> {
                    val value = 1
                    val num4 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val1", 0)!!
                    b = num4.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@Quantcomparisonscroll2, Quantcomparisonscroll3::class.java)
                    send2.putExtra("val2", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton7 -> {
                    value = 0
                    val num2 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val1", 0)!!
                    b = num2.calculatescore1(value)
                    sum = a + b
                    val send3 = Intent(this@Quantcomparisonscroll2, Quantcomparisonscroll3::class.java)
                    send3.putExtra("val2", sum)
                    startActivity(send3)
                    finish()
                }
                R.id.radioButton8 -> {
                    value = 0
                    val num6 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val1", 0)!!
                    b = num6.calculatescore1(value)
                    sum = a + b
                    val send8 = Intent(this@Quantcomparisonscroll2, Quantcomparisonscroll3::class.java)
                    send8.putExtra("val2", sum)
                    startActivity(send8)
                    finish()
                }
            }
        })
        rg?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            if (R.id.radioButton5 == checkedId) {
                value = 0
            } else if (R.id.radioButton6 == checkedId) {
                value1 = 1
            } else if (R.id.radioButton7 == checkedId) {
                value2 = 0
            } else if (R.id.radioButton8 == checkedId) {
                value3 = 0
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

                        val bol = Intent(this@Quantcomparisonscroll2, Times::class.java)
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
        val make = AlertDialog.Builder(this@Quantcomparisonscroll2)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}