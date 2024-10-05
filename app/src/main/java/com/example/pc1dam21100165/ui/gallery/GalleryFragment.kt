package com.example.pc1dam21100165.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pc1dam21100165.R
import com.example.pc1dam21100165.ui.adapter.PlayerAdapter
import com.example.pc1dam21100165.ui.model.PlayerModel

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_gallery, container, false)

        val rvPlayer: RecyclerView = view.findViewById(R.id.rvPlayer)
        rvPlayer.layoutManager = LinearLayoutManager(requireContext())
        rvPlayer.adapter = PlayerAdapter(getSongs())
        return view

    }

    private fun getSongs(): List<PlayerModel>{
        val lstPlayer: ArrayList<PlayerModel> = ArrayList()

        lstPlayer.add(
            PlayerModel(1, R.drawable.halaand, "Erling Haaland"
                , "2000", "23")
        )
        lstPlayer.add(
            PlayerModel(2, R.drawable.bellingham, "Jude Beillingham"
                , "2000", "23")
        )
        lstPlayer.add(
            PlayerModel(3, R.drawable.quispe, "Piero Quispe"
                , "2001", "22")
        )

        return lstPlayer
    }
}