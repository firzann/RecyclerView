package com.example.binarchap6recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MobilAdapter :RecyclerView.Adapter<MobilAdapter.MobilViewHolder>() {
    private val mobils: MutableList<Mobil> = mutableListOf()

    fun addMobils(mobils: List<Mobil>) {
        this.mobils.addAll(mobils)
        notifyDataSetChanged()
    }

    inner class MobilViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(itemMobil: Mobil) = itemView.run {
            val tvmerek : TextView = findViewById(R.id.tv_merek)
            val tvwarna : TextView = findViewById(R.id.tv_warna)
            val tvkondisi : TextView = findViewById(R.id.tv_kondisi)
            val tvharga : TextView = findViewById(R.id.tv_harga)
            val tvtipe : TextView = findViewById(R.id.tv_tipe)

            tvmerek.text = itemMobil.merek
            tvwarna.text = itemMobil.warna
            tvkondisi.text = itemMobil.kondisi
            tvharga.text = itemMobil.harga.toString()/*karena dia tipenya integer jadi hrs diconvert ke string dulu*/
            tvtipe.text = itemMobil.tipe
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilViewHolder {
        val context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item_mobil, parent, false)
        return MobilViewHolder(view)
    }

    override fun onBindViewHolder(holder: MobilViewHolder, position: Int) {
        val mobil = mobils[position]
        holder.bind(mobil)
    }

    override fun getItemCount(): Int {
        return mobils.size
    }
}