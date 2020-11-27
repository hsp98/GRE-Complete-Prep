package mega.GRE.examination
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.content.DialogInterface

class Results2 : AppCompatActivity() {
    var btn: Button? = null
    var txt: TextView? = null
    var a = 0
    var b = 0
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results2)
        btn = findViewById<Button>(R.id.button170)
        val inte: Intent = getIntent()
        a = inte?.getIntExtra("val8", 0)
        btn!!.setOnClickListener {
            val num = Scorescollection()
            val overall: Int = num.grandtotal(a)
            val make1 = AlertDialog.Builder(this@Results2)
            make1.setTitle("RESULT STATUS")
            make1.setMessage("You have successfully completed the quant numeric entry quiz and your score is $overall out of 8. Click HOME to go back to home screen")
            make1.setPositiveButton("HOME", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    val send = Intent(this@Results2, Home::class.java)
                    startActivity(send)
                    finish()
                }
            })
            val alert = make1.create()
            alert.show()
        }
    }
}