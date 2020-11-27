package mega.GRE.examination

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Quantnumericscroll7 : AppCompatActivity() {
    var et: EditText? = null
    var btn: Button? = null
    var inte: Intent? = null
    var a = 0
    var b = 0
    var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quantnumericscroll7)
        et = findViewById(R.id.edittext146)
        btn = findViewById(R.id.button146)
        btn?.setOnClickListener(View.OnClickListener {
            val va = et?.getText().toString()
            val answer = va.toInt()
            if (answer == 13) {
                inte = intent
                a = inte?.getIntExtra("val6", 0)!!
                b = 1
                sum = a + b
                val i = Intent(this@Quantnumericscroll7, Quantnumericscroll8::class.java)
                i.putExtra("val7", sum)
                startActivity(i)
                finish()
            } else {
                inte = intent
                a = inte?.getIntExtra("val6", 0)!!
                b = 0
                sum = a + b
                val i = Intent(this@Quantnumericscroll7, Quantnumericscroll8::class.java)
                i.putExtra("val7", sum)
                startActivity(i)
                finish()
            }
        })
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    protected fun exitByBackKey() {
        val make = AlertDialog.Builder(this@Quantnumericscroll7)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}