package mega.GRE.examination

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Feedback : AppCompatActivity() {
    var txt: TextView? = null
    var ed: EditText? = null
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        txt = findViewById<View>(R.id.textView9) as TextView
        ed = findViewById<View>(R.id.edit) as EditText
        btn = findViewById<View>(R.id.button16) as Button
        btn!!.setOnClickListener {
            val value1 = ed!!.text.toString()
            if (value1.length == 0) {
                val num = Viewdialog()
                num.showDialog(this@Feedback, "PLEASE WRITE YOUR VALUABLE FEEDBACK BEFORE SENDING, EMPTY FEEDBACK IS OF NO USE!")
            } else {
                val num2 = Viewdialog()
                num2.showDialog(this@Feedback, "THANK YOU FOR PROVIDING YOUR FEEDBACK, WE WILL MAKE ALL THE CHANGES SUGGESTED BY YOU IN THE NEXT UPDATE.")
            }
        }
    }
}