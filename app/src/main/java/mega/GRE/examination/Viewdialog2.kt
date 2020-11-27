package mega.GRE.examination

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


class Viewdialog2 : Activity() {
    fun showDialog(activity: Activity?, msg: String?) {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog)
        val text: TextView = dialog.findViewById<TextView>(R.id.text_dialog)
        text.setText(msg)
        val dialogButton = dialog.findViewById<Button>(R.id.btn_dialog)
        dialogButton.setOnClickListener {
            val send = Intent(this@Viewdialog2, Home::class.java)
            startActivity(send)
            finish()
        }
        dialog.show()
    }
}