package com.example.pc1dam21100165.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.pc1dam21100165.R
import com.example.pc1dam21100165.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val equipos = arrayOf(
            "FC Barcelona",
            "Real Madrid",
            "Manchester United",
            "Bayern Munich",
            "Liverpool",
            "Esan FC",
            "Juventus",
            "Inter de Milán"
        )

        val listView: ListView = view.findViewById(R.id.lvEquipos)

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, equipos)
        listView.adapter = adapter

        return view
        }
}