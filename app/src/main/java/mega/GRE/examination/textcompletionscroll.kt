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


class textcompletionscroll : AppCompatActivity() {
    var rg: RadioGroup? = null
    var tv1: TextView? = null
    var btn: Button? = null
    var value = 0
    var value1 = 0
    var value2 = 0
    var value3 = 0
    var clicked = false
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.textcompletionscroll)
        rg = findViewById<RadioGroup>(R.id.r700)
        tv1 = findViewById<TextView>(R.id.textView700)
        btn = findViewById<Button>(R.id.button700)
        btn!!.setOnClickListener {
            clicked = true
            val ids: Int = rg?.getCheckedRadioButtonId()!!
            when (ids) {
                R.id.radioButton700 -> {
                    value = 1
                    val num = Scorescollection()
                    val send = Intent(this@textcompletionscroll, textcompletionscroll2::class.java)
                    send.putExtra("val1", num.calculatescore1(value))
                    startActivity(send)
                    finish()
                }
                R.id.radioButton701 -> {
                    value = 0
                    val num4 = Scorescollection()
                    val send1 = Intent(this@textcompletionscroll, textcompletionscroll2::class.java)
                    send1.putExtra("val1", num4.calculatescore1(value))
                    startActivity(send1)
                    finish()
                }
                R.id.radioButton702 -> {
                    value = 0
                    val num2 = Scorescollection()
                    val send2 = Intent(this@textcompletionscroll, textcompletionscroll2::class.java)
                    send2.putExtra("val1", num2.calculatescore1(value))
                    startActivity(send2)
                    finish()
                }
                R.id.radioButton703 -> {
                    value = 0
                    val num6 = Scorescollection()
                    val send8 = Intent(this@textcompletionscroll, textcompletionscroll2::class.java)
                    send8.putExtra("val1", num6.calculatescore1(value))
                    startActivity(send8)
                    finish()
                }
            }
        }
        rg?.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                if (R.id.radioButton700 == checkedId) {
                    value = 1
                } else if (R.id.radioButton701 == checkedId) {
                    value1 = 0
                } else if (R.id.radioButton702 == checkedId) {
                    value2 = 0
                } else if (R.id.radioButton703 == checkedId) {
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
                        val bol = Intent(this@textcompletionscroll, Times::class.java)
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
        val make = AlertDialog.Builder(this@textcompletionscroll)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface, which: Int) {}
        })
        val alert = make.create()
        alert.show()
    }
}