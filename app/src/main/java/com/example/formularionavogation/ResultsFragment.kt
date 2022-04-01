package com.example.formularionavogation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.formularionavogation.databinding.FragmentResultsBinding

class ResultsFragment : Fragment() {

    private lateinit var binding: FragmentResultsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultsBinding.inflate(layoutInflater)

        val nombreRecibido = arguments?.getString("nombre")
        val apllidoPRecibido = arguments?.getString("apellidoPat")
        val apllidoMRecibido = arguments?.getString("apellidoMat")
        val nombreUsuarioRecibido = arguments?.getString("nombreUsuario")
        val correoRecibido = arguments?.getString("correo")

        binding.txtNombreResult.setText(nombreRecibido)
        binding.txtApellidoPResult.setText(apllidoPRecibido)
        binding.txtApellidoMResult.setText(apllidoMRecibido)
        binding.txtNombreUsuarioResult.setText(nombreUsuarioRecibido)
        binding.txtCorreoResult.setText(correoRecibido)

        return binding.root
    }

}