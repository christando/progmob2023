package com.example.progmob2023new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class SampleList : AppCompatActivity() {
    lateinit var btnlist : Button
    lateinit var btnrecycle : Button
    lateinit var btncardview : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnlist = findViewById(R.id.btnShowList)
        btnrecycle = findViewById((R.id.btnSampleRV))
        btncardview = findViewById(R.id.rvCardView)

        btnlist.setOnClickListener(View.OnClickListener { view->
            var bundle = Bundle()
            var intent = Intent(this@SampleList, SampleListView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnrecycle.setOnClickListener(View.OnClickListener { view->
            var bundle = Bundle()
            var intent = Intent(this@SampleList, SampleRecyclerView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btncardview.setOnClickListener(View.OnClickListener { view->
            var bundle = Bundle()
            var intent = Intent(this@SampleList, SampleCardView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

    }

}

