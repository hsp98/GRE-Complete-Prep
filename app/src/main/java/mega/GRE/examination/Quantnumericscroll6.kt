package mega.GRE.examination

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Quantnumericscroll6 : AppCompatActivity() {
    var et: EditText? = null
    var btn: Button? = null
    var inte: Intent? = null
    var a = 0
    var b = 0
    var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quantnumericscroll6)
        et = findViewById(R.id.edittext145)
        btn = findViewById(R.id.button145)
        btn?.setOnClickListener(View.OnClickListener {
            val va = et?.getText().toString()
            val answer = va.toDouble()
            if (answer == 0.20) {
                inte = intent
                a = inte?.getIntExtra("val5", 0)!!
                b = 1
                sum = a + b
                val i = Intent(this@Quantnumericscroll6, Quantnumericscroll7::class.java)
                i.putExtra("val6", sum)
                startActivity(i)
                finish()
            } else {
                inte = intent
                a = inte?.getIntExtra("val5", 0)!!
                b = 0
                sum = a + b
                val i = Intent(this@Quantnumericscroll6, Quantnumericscroll7::class.java)
                i.putExtra("val6", sum)
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
        val make = AlertDialog.Builder(this@Quantnumericscroll6)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}