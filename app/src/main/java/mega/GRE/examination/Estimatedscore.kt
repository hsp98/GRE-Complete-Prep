package mega.GRE.examination

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Estimatedscore : AppCompatActivity() {
    var verb = 0
    var quant = 0
    var tv1: TextView? = null
    var tv2: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estimatedscore)
        tv1 = findViewById<View>(R.id.textView5) as TextView
        tv2 = findViewById<View>(R.id.textView8) as TextView
        val num = intent
        verb = num.getIntExtra("getit", 0)
        if (verb == 0) {
            tv1!!.text = "YOUR ESTIMATED VERBAL SCORE: " + "YOU HAVE NOT BEGUN THE PRACTICE IN THIS SESSION, NEITHER HAVE YOU TAKEN ANY QUIZ, SO WE CANNOT ESTIMATE YOUR SCORE. TO GET YOUR ESTIMATED SCORE TO BE DISPLAYED, YOU NEED TO PRACTICE ATLEAST ONE SET OF ANY SECTION OR TAKE A QUIZ FOR THIS SESSION."
        } else {
            tv1!!.text = "YOUR ESTIMATED VERBAL SCORE: $verb"
        }
        if (quant == 0) {
            tv2!!.text = "YOUR ESTIMATED QUANT SCORE: " + "YOU HAVE NOT BEGUN THE PRACTICE, NEITHER HAVE YOU TAKEN ANY QUIZ, SO WE CANNOT ESTIMATE YOUR SCORE. TO GET YOUR ESTIMATED SCORE TO BE DISPLAYED, YOU NEED TO PRACTICE ATLEAST ONE SET OF ANY SECTION OR TAKE A QUIZ."
        } else {
            tv2!!.text = "YOUR ESTIMATED QUANT SCORE: $quant"
        }
    }
}