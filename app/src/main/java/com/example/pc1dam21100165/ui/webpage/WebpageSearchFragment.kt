package com.example.pc1dam21100165.ui.webpage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.pc1dam21100165.MainActivity
import com.example.pc1dam21100165.R
import com.example.pc1dam21100165.ui.slideshow.WebpageViewModel

class WebpageSearchFragment : Fragment() {
    private val webpageViewModel: WebpageViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_search, container, false)

        val btSearch: Button = view.findViewById(R.id.btnSearch)
        val etUrlSearch: EditText = view.findViewById(R.id.etUrlSearch)


        btSearch.setOnClickListener {
            val url = etUrlSearch.text.toString()
            webpageViewModel.setUrl(url)
        }

        return view
    }
}