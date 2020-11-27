package mega.GRE.examination

import android.app.Activity;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


class Vocabscroll : ListActivity() {
    private val text: TextView? = null
    private var listValues: MutableList<String>?=null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocabscroll)
        listValues = ArrayList()
        listValues?.add("Words with meaning")
        // initiate the listadapter
        val myAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this,
                R.layout.row_layoutlist, R.id.listText, listValues)
        // assign the list adapter
        setListAdapter(myAdapter)
    }

    // when an item of the list is clicked
    protected override fun onListItemClick(list: ListView, view: View, position: Int, id: Long) {
        super.onListItemClick(list, view, position, id)
        val selectedItem = getListView().getItemAtPosition(position) as String
        //String selectedItem = (String) getListAdapter().getItem(position);
        if (position == 0) {
            showDialog(this@Vocabscroll, "Now you are about to view TOP 150 plus most Frequently asked words in the GRE Exam.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")
        }
    }

    fun showDialog(activity: Activity?, msg: String) {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog)
        val text: TextView = dialog.findViewById<TextView>(R.id.text_dialog)
        text.setText(msg)
        val dialogButton = dialog.findViewById<Button>(R.id.btn_dialog)
        dialogButton.setOnClickListener {
            if (msg == "Now you are about to view TOP 150 plus most Frequently asked words in the GRE Exam.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!") {
                val intent = Intent(this@Vocabscroll, Top500wordslist::class.java)
                startActivity(intent)
                finish()
            }
        }
        dialog.show()
    }
}