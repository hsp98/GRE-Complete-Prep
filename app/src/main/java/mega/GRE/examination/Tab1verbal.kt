package mega.GRE.examination

import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

/**
 * Created by Neelesh Singh(web) on 3/15/2017.
 */
class Tab1verbal : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_main_activitytab, container, false)
        val btn = rootView.findViewById<View>(R.id.button4) as Button
        btn?.setOnClickListener {
            val num = Intent(this@Tab1verbal.activity, Vocabscroll::class.java)
            startActivity(num)
        }
        val btn2 = rootView.findViewById<Button>(R.id.button7)
        btn2.setOnClickListener {
            val builder = AlertDialog.Builder(this@Tab1verbal.activity!!)
            builder.setMessage("Are you sure you want to start the quiz, once started back button will be disabled. Do you want to continue?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, id: Int) {
                            val num = Intent(this@Tab1verbal.activity, textcompletionscroll::class.java)
                            startActivity(num)
                        }
                    })
                    .setNegativeButton("No", object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, id: Int) {
                            dialog.cancel()
                        }
                    })
            val alert = builder.create()
            alert.show()
        }
        return rootView
    }
}