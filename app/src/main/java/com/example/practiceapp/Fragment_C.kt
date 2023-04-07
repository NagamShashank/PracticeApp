package com.example.practiceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.practiceapp.databinding.FragmentCBinding
import com.example.practiceapp.databinding.FragmentMainBinding


class Fragment_C : Fragment() {

    private var FragmentC_Binding : FragmentCBinding? = null
    private val binding get() = FragmentC_Binding!!

    val args: Fragment_CArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        FragmentC_Binding = FragmentCBinding.inflate(inflater,container,false)

        val textMessage = args.text
        binding.TextMessage.text = textMessage




        return binding.root
    }

}