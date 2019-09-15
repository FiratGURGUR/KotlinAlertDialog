package com.gurgur.kotlinalertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button(view: View)
    {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Merhaba")
        alert.setMessage("Kotlin ile Alert Dialog Örneği")
        alert.setCancelable(true);
        alert.setIcon(R.drawable.kotlinlogo);

        alert.setPositiveButton("Tamam") {
                dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(applicationContext,"Onaylandı!",Toast.LENGTH_SHORT).show()
        }

        alert.setNegativeButton("İptal") {dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(applicationContext, "İptal edildi!", Toast.LENGTH_SHORT).show()


        }
        alert.show()
    }
}