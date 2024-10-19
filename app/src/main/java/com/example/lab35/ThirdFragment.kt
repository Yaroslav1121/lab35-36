package com.example.lab35

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab35.databinding.FragmentFirstBinding
import com.example.lab35.databinding.FragmentSecondBinding
import com.example.lab35.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentThirdBinding.inflate(inflater,container,false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToFirst.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)

        }
    }
}
