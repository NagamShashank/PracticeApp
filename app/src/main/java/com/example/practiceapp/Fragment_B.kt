package com.example.practiceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.practiceapp.databinding.FragmentBBinding
import com.example.practiceapp.databinding.FragmentCBinding


class Fragment_B : Fragment() {

    private var FragmentB_Binding : FragmentBBinding? = null
    private val binding get() = FragmentB_Binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        FragmentB_Binding = FragmentBBinding.inflate(inflater,container,false)


        binding.SendBtn.setOnClickListener {
            view?.let { it1 ->
                val text = binding.TextEditText.text.toString()
                if (text.isNotEmpty()) {

                    val action = Fragment_BDirections.actionFragmentBToFragmentC(text)
                    Navigation.findNavController(it1).navigate(action)
                } else {
                    Toast.makeText(context, "Please Enter Some Text", Toast.LENGTH_SHORT).show()
                }
            }
        }

        return binding.root
    }


}