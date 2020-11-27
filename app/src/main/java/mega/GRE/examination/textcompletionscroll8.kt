package mega.GRE.examination

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


class textcompletionscroll8 : AppCompatActivity() {
    var rg: RadioGroup? = null
    var tv1: TextView? = null
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
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.textcompletionscroll8)
        rg = findViewById<RadioGroup>(R.id.r707)
        tv1 = findViewById<TextView>(R.id.textView707)
        btn = findViewById<Button>(R.id.button707)
        btn!!.setOnClickListener {
            clicked = true
            val ids: Int = rg?.getCheckedRadioButtonId()!!
            when (ids) {
                R.id.radioButton728 -> {
                    value = 0
                    val num = Scorescollection()
                    get = getIntent()
                    a = get?.getIntExtra("val7", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b
                    val send = Intent(this@textcompletionscroll8, Result3::class.java)
                    send.putExtra("val8", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton729 -> {
                    val value = 0
                    val numb = Scorescollection()
                    get = getIntent()
                    a = get?.getIntExtra("val7", 0)!!
                    b = numb.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@textcompletionscroll8, Result3::class.java)
                    send2.putExtra("val8", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton730 -> {
                    value = 1
                    val numbs = Scorescollection()
                    get = getIntent()
                    a = get?.getIntExtra("val7", 0)!!
                    b = numbs.calculatescore1(value)
                    sum = a + b
                    val send3 = Intent(this@textcompletionscroll8, Result3::class.java)
                    send3.putExtra("val8", sum)
                    startActivity(send3)
                    finish()
                }
                R.id.radioButton731 -> {
                    value = 0
                    val numbss = Scorescollection()
                    get = getIntent()
                    a = get?.getIntExtra("val7", 0)!!
                    b = numbss.calculatescore1(value)
                    sum = a + b
                    val send4 = Intent(this@textcompletionscroll8, Result3::class.java)
                    send4.putExtra("val8", sum)
                    startActivity(send4)
                    finish()
                }
            }
        }
        rg?.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                if (R.id.radioButton728 == checkedId) {
                    value = 0
                } else if (R.id.radioButton729 == checkedId) {
                    value1 = 0
                } else if (R.id.radioButton730 == checkedId) {
                    value2 = 1
                } else if (R.id.radioButton731 == checkedId) {
                    value3 = 0
                }
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
                        val bol = Intent(this@textcompletionscroll8, Times::class.java)
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
        val make = AlertDialog.Builder(this@textcompletionscroll8)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface, which: Int) {}
        })
        val alert = make.create()
        alert.show()
    }
}