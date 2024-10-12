package com.example.pc1dam21100165.ui.webpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.pc1dam21100165.R
import com.example.pc1dam21100165.ui.slideshow.WebpageViewModel

class WebpageShowFragment : Fragment() {
    private val webpageViewModel: WebpageViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_webpageshow, container, false)

        val webView: WebView = view.findViewById(R.id.wvPage)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                if (url != null){
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webpageViewModel.url.observe(viewLifecycleOwner) { url ->
            webView.loadUrl(url)
        }

        return view
    }
}