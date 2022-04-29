package com.example.projectnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var LiveAdapter: LiveAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide();

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {

        val dataSource = DataSource.createDataset()
            this.LiveAdapter.setDataSet(dataSource)

    }

    private fun initRecyclerView() {

        this.LiveAdapter = LiveAdapter()

        recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerview.adapter = this.LiveAdapter

    }

}