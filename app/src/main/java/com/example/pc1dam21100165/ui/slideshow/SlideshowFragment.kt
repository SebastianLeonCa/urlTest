package com.example.pc1dam21100165.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pc1dam21100165.R
import com.example.pc1dam21100165.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_slideshow, container, false)

        val btCalcular: Button = view.findViewById(R.id.btnCalcular)
        val etKilometros: EditText = view.findViewById(R.id.etKilometros)
        val etMinutos: EditText = view.findViewById(R.id.etMinutos)
        val txtResult: TextView = view.findViewById(R.id.textResult)


        btCalcular.setOnClickListener {
            val kilometrosText = etKilometros.text.toString()
            val minutosText = etMinutos.text.toString()

            val kilometros = kilometrosText.toDouble()
            val minutos = minutosText.toDouble()

            val resultado = kilometros / minutos

            txtResult.text = "$resultado km/min"
        }

        return view
    }
}