package com.example.practiceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.practiceapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var FragmentBinding : FragmentMainBinding? = null
    private val binding get() = FragmentBinding!!

    override fun onCreateView(finflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentBinding = FragmentMainBinding.inflate(finflater,container,false)

//        binding.FragmentABtn.setOnClickListener {
//            view?.let { it1 ->
//                Navigation.findNavController(it1).navigate(R.id.action_mainFragment_to_fragment_A)
//            }
//        }
//
//        binding.FragmentBBtn.setOnClickListener {
//            view?.let { it1 ->
//                Navigation.findNavController(it1).navigate(R.id.action_mainFragment_to_fragment_B)
//            }
//        }

        //   return inflater.inflate(R.layout.fragment_main, container, false)
        return  binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}