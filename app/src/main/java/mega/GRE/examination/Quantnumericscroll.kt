package mega.GRE.examination

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Quantnumericscroll : AppCompatActivity() {
    var et: EditText? = null
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quantnumericscroll)
        et = findViewById(R.id.edittext140)
        btn = findViewById(R.id.button140)
        btn?.setOnClickListener(View.OnClickListener {
            val va = et?.getText().toString()
            if (va === "") {
                Toast.makeText(this@Quantnumericscroll, "Please enter answer to go for the next question", Toast.LENGTH_SHORT).show()
            } else {
                val answer = va.toDouble()
                if (answer == 39.50) {
                    val i = Intent(this@Quantnumericscroll, Quantnumericscroll2::class.java)
                    i.putExtra("val1", 1)
                    startActivity(i)
                    finish()
                } else {
                    val i = Intent(this@Quantnumericscroll, Quantnumericscroll2::class.java)
                    i.putExtra("val1", 0)
                    startActivity(i)
                    finish()
                }
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
        val make = AlertDialog.Builder(this@Quantnumericscroll)
        make.setTitle("SORRY !!")
        make.setMessage("As stated earlier, you cannot go back once you have started the quiz, so mark the answers carefully as there will be no looking back.")
        make.setPositiveButton("OK") { dialog, which -> }
        val alert = make.create()
        alert.show()
    }
}