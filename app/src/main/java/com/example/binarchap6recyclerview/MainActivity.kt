package com.example.binarchap6recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvMobil: RecyclerView by lazy {
        findViewById(R.id.rv_Listmobil)
    }

    private val mobilAdapter: MobilAdapter by lazy {
        MobilAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMobil.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvMobil.adapter = mobilAdapter

        val dataMobil = Constant.mobils
        mobilAdapter.addMobils(dataMobil)

    }
}