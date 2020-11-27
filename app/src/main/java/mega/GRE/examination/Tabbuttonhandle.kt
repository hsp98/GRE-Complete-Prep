package mega.GRE.examination

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


class Tabbuttonhandle : AppCompatActivity() {
    var btn: Button? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_activitytab)
        btn = findViewById<View>(R.id.button4) as Button?
        btn!!.setOnClickListener {
            val i = Intent(this@Tabbuttonhandle, Privacy::class.java)
            startActivity(i)
        }
    }
}