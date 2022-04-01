package com.example.formularionavogation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.formularionavogation.databinding.FragmentTestBinding

class TestFragment : Fragment() {
    private lateinit var binding : FragmentTestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTestBinding.inflate(inflater)

        val navController = findNavController()

        binding.btnEnviar.setOnClickListener{

            val nombre: String = binding.editTextNombre.text.toString()
            val apellidop: String = binding.editTextApellidoP.text.toString()
            val apellidom: String = binding.editTextApellidoM.text.toString()
            val nombreusuario: String = binding.editTextNombreUsuario.text.toString()
            val correo: String = binding.editTextCorreo.text.toString()

            val directions = TestFragmentDirections.actionTestFragmentToResultsFragment(nombre, apellidop, apellidom, nombreusuario, correo)
            navController.navigate(directions)
        }

        return binding.root
    }

}