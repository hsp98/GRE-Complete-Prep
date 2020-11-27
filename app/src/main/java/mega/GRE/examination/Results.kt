package mega.GRE.examination
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.content.Intent
import android.os.Bundle

class Results : AppCompatActivity() {
    var btn: Button? = null
    var txt: TextView? = null
    var a = 0
    var b = 0
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results)
        btn = findViewById<Button>(R.id.button110)
        txt = findViewById<TextView>(R.id.textView130)
        val inte: Intent = getIntent()
        a = inte?.getIntExtra("val8", 0)
        btn!!.setOnClickListener {
            val num = Scorescollection()
            val overall: Int = num.grandtotal(a)
            val dislog = Viewdialog2()
            dislog.showDialog(this@Results, "You have successfully completed the quant comparison quiz and your score is $overall out of 8. Click Ok to go back to home screen")
        }
    }
}