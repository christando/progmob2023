package com.example.progmob2023new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txMain : TextView
    lateinit var txMain2 : TextView
    lateinit var btnMain : Button
    lateinit var edInputNama : EditText
    lateinit var btnhelp:Button
    lateinit var btnlinear:Button
    lateinit var btnConstraint:Button
    lateinit var btnactivity:Button
    lateinit var btnprotein:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        setContentView(R.layout.layout_main)


        txMain = findViewById(R.id.textView)
        txMain.text = getString(R.string.hello_progmob_2023)

        txMain2 = findViewById(R.id.textView2)
        txMain2.text = getString(R.string.progmob_2023)

        btnMain = findViewById(R.id.button)
        btnMain.text = getString(R.string.progmob_2023_1)

        btnhelp = findViewById(R.id.btn_help)
        btnlinear = findViewById(R.id.btn_linear)
        btnConstraint = findViewById(R.id.btn_constrain)
        btnactivity = findViewById(R.id.btn_activity)
        btnprotein = findViewById(R.id.btn_Protein)

        edInputNama = findViewById(R.id.input_nama)

        btnMain.setOnClickListener(View.OnClickListener { view->
            txMain.text = edInputNama.text.toString()
        })

        btnhelp.setOnClickListener(View.OnClickListener { view->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText", strTmp)
            var intent = Intent(this@MainActivity, HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnlinear.setOnClickListener(View.OnClickListener { view->
            var intent = Intent(this@MainActivity, tes_linear::class.java)
            startActivity(intent)
        })

        btnConstraint.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, Constraint_Activity::class.java)
            startActivity(intent)
        })
        btnactivity.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, TableActivity::class.java)
            startActivity(intent)
        })

        btnprotein.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, ProteinTrackerActivity::class.java)
            startActivity(intent)
        })

    }
}