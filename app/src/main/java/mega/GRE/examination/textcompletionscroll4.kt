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


class textcompletionscroll4 : AppCompatActivity() {
    var rg: RadioGroup? = null
    var tv1: TextView? = null
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
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.textcompletionscroll4)
        rg = findViewById<RadioGroup>(R.id.r703)
        tv1 = findViewById<TextView>(R.id.textView703)
        btn = findViewById<Button>(R.id.button703)
        btn!!.setOnClickListener {
            clicked = true
            val ids: Int = rg?.getCheckedRadioButtonId()!!
            when (ids) {
                R.id.radioButton712 -> {
                    value = 1
                    val num = Scorescollection()
                    inte = getIntent()
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num.calculatescore1(value)
                    sum = a + b
                    val send = Intent(this@textcompletionscroll4, textcompletionscroll5::class.java)
                    send.putExtra("val4", sum)
                    startActivity(send)
                    finish()
                }
                R.id.radioButton713 -> {
                    val value = 0
                    val num4 = Scorescollection()
                    inte = getIntent()
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num4.calculatescore1(value)
                    sum = a + b
                    val send2 = Intent(this@textcompletionscroll4, textcompletionscroll5::class.java)
                    send2.putExtra("val4", sum)
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton714 -> {
                    value = 0
                    val num2 = Scorescollection()
                    inte = getIntent()
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num2.calculatescore1(value)
                    sum = a + b
                    val send3 = Intent(this@textcompletionscroll4, textcompletionscroll5::class.java)
                    send3.putExtra("val4", sum)
                    startActivity(send3)
                    finish()
                }
                R.id.radioButton715 -> {
                    value = 0
                    val num6 = Scorescollection()
                    inte = getIntent()
                    a = inte?.getIntExtra("val3", 0)!!
                    b = num6.calculatescore1(value)
                    sum = a + b
                    val send8 = Intent(this@textcompletionscroll4, textcompletionscroll5::class.java)
                    send8.putExtra("val4", sum)
                    startActivity(send8)
                    finish()
                }
            }
        }
        rg?.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                if (R.id.radioButton712 == checkedId) {
                    value = 1
                } else if (R.id.radioButton713 == checkedId) {
                    value1 = 0
                } else if (R.id.radioButton714 == checkedId) {
                    value2 = 0
                } else if (R.id.radioButton715 == checkedId) {
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
                        val bol = Intent(this@textcompletionscroll4, Times::class.java)
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
        val make = AlertDialog.Builder(this@textcompletionscroll4)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface, which: Int) {}
        })
        val alert = make.create()
        alert.show()
    }
}