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

class Quantcomparisonscroll8 : AppCompatActivity() {
    var rg: RadioGroup? = null
    var tv1: TextView? = null
    var tv2: TextView? = null
    var tv3: TextView? = null
    var btn: Button? = null
    var value = 0
    var value1 = 0
    var value2 = 0
    var value3 = 0
    var clicked = false
    var a = 0
    var b = 0
    var sum = 0
    var get: Intent? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quantcomparisonscroll8)
        rg = findViewById(R.id.r8)
        tv1 = findViewById(R.id.textView121)
        tv2 = findViewById(R.id.textView122)
        tv3 = findViewById(R.id.textView123)
        btn = findViewById(R.id.button108)
        btn?.setOnClickListener(View.OnClickListener {
            clicked = true
            val ids = rg?.getCheckedRadioButtonId()
            when (ids) {
                R.id.radioButton29 -> {
                    value = 0
                    val num = Scorescollection()
                    get = intent
                    a = get?.getIntExtra("val7", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b

                    val send = Intent(this@Quantcomparisonscroll8, Results::class.java)
                    send.putExtra("val8", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton30 -> {
                    val value = 0
                    val numb = Scorescollection()
                    get = intent
                    a = get?.getIntExtra("val7", 0)!!
                    b = numb.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@Quantcomparisonscroll8, Results::class.java)
                    send2.putExtra("val8", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton31 -> {
                    value = 1
                    val numbs = Scorescollection()
                    get = intent
                    a = get?.getIntExtra("val7", 0)!!
                    b = numbs.calculatescore1(value)
                    sum = a + b
                    val send3 = Intent(this@Quantcomparisonscroll8, Results::class.java)
                    send3.putExtra("val8", sum)
                    startActivity(send3)
                    finish()
                }
                R.id.radioButton32 -> {
                    value = 0
                    val numbss = Scorescollection()
                    get = intent
                    a = get?.getIntExtra("val7", 0)!!
                    b = numbss.calculatescore1(value)
                    sum = a + b
                    val send4 = Intent(this@Quantcomparisonscroll8, Results::class.java)
                    send4.putExtra("val8", sum)
                    startActivity(send4)
                    finish()
                }
            }
        })
        rg?.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            if (R.id.radioButton29 == checkedId) {
                value = 0
            } else if (R.id.radioButton30 == checkedId) {
                value1 = 0
            } else if (R.id.radioButton31 == checkedId) {
                value2 = 1
            } else if (R.id.radioButton32 == checkedId) {
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
                        val bol = Intent(this@Quantcomparisonscroll8, Times::class.java)
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
        val make = AlertDialog.Builder(this@Quantcomparisonscroll8)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}