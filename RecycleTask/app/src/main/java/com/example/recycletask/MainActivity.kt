package com.example.recycletask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var names: ArrayList<String>
    private lateinit var EnterField: EditText
    private lateinit var Enterbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EnterField = findViewById(R.id.Enterfeild)
        Enterbtn = findViewById(R.id.Enterbtn)
        names = ArrayList()

        rvMessages.adapter = myAdapter(this, names)
        rvMessages.layoutManager = LinearLayoutManager(this)

        Enterbtn.setOnClickListener {

            val name = EnterField.text.toString()
            names.add(name)

        rvMessages.adapter?.notifyDataSetChanged()

        }
    }
}