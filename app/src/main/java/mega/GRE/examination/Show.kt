package mega.GRE.examination

import android.view.View
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class Show : AppCompatActivity() {
    var tx: TextView? = null
    var tx2: TextView? = null
    var tx3: TextView? = null
    var btn: Button? = null
    var predicted = 0
    var get = 0
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        val inte: Intent = getIntent()
        val total: Int = inte?.getIntExtra("final", 0)
        tx = findViewById<View>(R.id.textView6) as TextView?
        tx2 = findViewById<View>(R.id.textView7) as TextView?
        btn = findViewById<View>(R.id.button15) as Button?
        tx3 = findViewById<View>(R.id.te) as TextView?
        tx?.setText("your score is: $total")
        predicted = 130 + 40 * total / 9
        btn!!.setOnClickListener {
            val inte = Intent(this@Show, Estimatedscore::class.java)
            inte?.putExtra("getit", predicted)
            startActivity(inte)
            finish()
        }
    }
}