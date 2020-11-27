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

class Mixedquiz10 : AppCompatActivity() {
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
        setContentView(R.layout.mixedquiz10)
        rg = findViewById(R.id.r606)
        tv1 = findViewById(R.id.textView617)
        btn = findViewById(R.id.button609)
        btn?.setOnClickListener(View.OnClickListener {
            clicked = true
            val ids = rg?.getCheckedRadioButtonId()
            when (ids) {
                R.id.radioButton624 -> {
                    value = 0
                    val num = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val9", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b
                    val send = Intent(this@Mixedquiz10, Mixedquiz11::class.java)
                    send.putExtra("val10", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton625 -> {
                    val value = 1
                    val num4 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val9", 0)!!
                    b = num4.calculatescore1(value)
                    sum = a + b
                    val send1 = Intent(this@Mixedquiz10, Mixedquiz11::class.java)
                    send1.putExtra("val10", sum)
                    startActivity(send1)
                    finish()
                }
                R.id.radioButton626 -> {
                    value = 0
                    val num2 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val9", 0)!!
                    b = num2.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@Mixedquiz10, Mixedquiz11::class.java)
                    send2.putExtra("val10", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton627 -> {
                    value = 0
                    val num6 = Scorescollection()
                    inte = intent
                    a = inte?.getIntExtra("val9", 0)!!
                    b = num6.calculatescore1(value)
                    sum = a + b
                    val send8 = Intent(this@Mixedquiz10, Mixedquiz11::class.java)
                    send8.putExtra("val10", sum)
                    startActivity(send8)
                    finish()
                }
            }
        })
        rg?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            if (R.id.radioButton624 == checkedId) {
                value = 0
            } else if (R.id.radioButton625 == checkedId) {
                value1 = 1
            } else if (R.id.radioButton626 == checkedId) {
                value2 = 0
            } else if (R.id.radioButton627 == checkedId) {
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
                        val bol = Intent(this@Mixedquiz10, Times::class.java)
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
        val make = AlertDialog.Builder(this@Mixedquiz10)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}