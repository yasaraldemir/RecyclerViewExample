package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.WriterListAdapter
import com.example.recyclerview.mock.MockList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycWriterList.adapter = WriterListAdapter(MockList.getMockedWriterList())
        recycWriterList.layoutManager = LinearLayoutManager(this)
    }
}