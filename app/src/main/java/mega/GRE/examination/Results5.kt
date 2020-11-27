package mega.GRE.examination
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.content.DialogInterface

class Results5 : AppCompatActivity() {
    var btn: Button? = null
    var txt: TextView? = null
    var a = 0
    var b = 0
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results5)
        btn = findViewById<Button>(R.id.button630)
        val inte: Intent = getIntent()
        a = inte?.getIntExtra("val16", 0)
        btn!!.setOnClickListener {
            val num = Scorescollection()
            val overall: Int = num.grandtotal(a)
            val make1 = AlertDialog.Builder(this@Results5)
            make1.setTitle("RESULT STATUS")
            make1.setMessage("You have successfully completed the miscellaneous quiz and your score is $overall out of 16. Click HOME to go back to home screen")
            make1.setPositiveButton("HOME", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    val send = Intent(this@Results5, Home::class.java)
                    startActivity(send)
                    finish()
                }
            })
            val alert = make1.create()
            alert.show()
        }
    }
}