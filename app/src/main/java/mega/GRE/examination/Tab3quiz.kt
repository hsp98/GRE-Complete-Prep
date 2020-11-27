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


class Tab3quiz : Fragment() {
    var btn2: Button? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_main_activitytabquiz, container, false)
        btn2 = rootView.findViewById(R.id.button250)
        btn2?.setOnClickListener(View.OnClickListener {
            val builder = AlertDialog.Builder(this@Tab3quiz.activity!!)
            builder.setMessage("Are you sure you want to start the mixed quiz that consists of 16 questions 8 from each section, once started back button will be disabled. Do you want to continue?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, id: Int) {

                            val num = Intent(this@Tab3quiz.activity, Mixedquiz::class.java)
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
        })
        return rootView
    }
}