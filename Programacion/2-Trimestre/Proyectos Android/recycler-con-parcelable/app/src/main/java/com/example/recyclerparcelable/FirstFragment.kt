package com.example.recyclerparcelable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerparcelable.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jugadores = mutableListOf(
            Jugador("Casillas", 1),
            Jugador("Piqué", 3),
            Jugador("Villa", 7),
            Jugador("Torres", 9),
            Jugador("Ramos", 15),
            Jugador("Iniesta", 6),
        )

        val recyclerView = binding.recyclerview
        val llm = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = llm
        val adapter = MyAdapter()
        recyclerView.adapter = adapter

        adapter.update(jugadores)
    }
}