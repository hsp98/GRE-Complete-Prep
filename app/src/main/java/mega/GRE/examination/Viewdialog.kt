package mega.GRE.examination

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;



class Viewdialog : Activity() {
    fun showDialog(activity: Activity?, msg: String?) {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog)
        val text: TextView = dialog.findViewById<View>(R.id.text_dialog) as TextView
        text.setText(msg)
        val dialogButton = dialog.findViewById<View>(R.id.btn_dialog) as Button
        dialogButton.setOnClickListener { dialog.dismiss() }
        dialog.show()
    }
}