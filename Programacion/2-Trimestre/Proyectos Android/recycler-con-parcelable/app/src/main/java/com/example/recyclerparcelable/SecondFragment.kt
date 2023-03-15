package com.example.recyclerparcelable

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import com.example.recyclerparcelable.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{bundle ->
            val jugador = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                bundle.getParcelable("jugador", Jugador::class.java)
            } else {
                bundle.getParcelable("jugador")
            }
            if(jugador != null){
                binding.tvName.text = jugador.nombre
                binding.tvNumber.text = jugador.numero.toString()
            }
        }

    }
}