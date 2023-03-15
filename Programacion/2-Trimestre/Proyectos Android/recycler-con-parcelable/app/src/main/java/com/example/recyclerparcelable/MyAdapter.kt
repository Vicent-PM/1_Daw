package com.example.recyclerparcelable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerparcelable.databinding.HolderPlayerBinding


/**
 * Created by sergi on 02/03/2022.
 * Copyright (c) 2022 Qastusoft. All rights reserved.
 */

class MyAdapter() :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

//    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val textView: TextView
//
//        init {
//            textView = view.findViewById(R.id.holder_name)
//        }
//
//        fun setMyData(jugador: String) {
//            textView.text = jugador
//            textView.setOnClickListener {
//                Toast.makeText(textView.context, "$jugador en posicion ${adapterPosition}", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }

    private val dataList = ArrayList<Jugador>()

    inner class MyViewHolder(private val binding: HolderPlayerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun setMyData(jugador: Jugador) {
            binding.holderName.text = jugador.nombre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = HolderPlayerBinding.inflate(layoutInflater, parent, false)
        return MyViewHolder(binding)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val jugador = dataList[position]
        holder.setMyData(jugador)

        holder.itemView.setOnClickListener {

             val bundle = bundleOf(
                 "jugador" to jugador
             )
            Navigation.findNavController(it)
                .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun add(item: Jugador) {
        dataList.add(item)
        notifyItemInserted(dataList.size)
    }

    fun remove() {
        dataList.removeAt(dataList.size - 1)
        notifyItemRemoved(dataList.size)
    }

    fun update(list: MutableList<Jugador>) {
        dataList.clear()
        dataList.addAll(list)
        notifyDataSetChanged()
    }

}