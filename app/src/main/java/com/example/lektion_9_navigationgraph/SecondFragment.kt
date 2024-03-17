package com.example.lektion_9_navigationgraph

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.navigation.Navigation

class SecondFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

       val flSecondFragment : FrameLayout = view.findViewById(R.id.fl_second_fragment)

        flSecondFragment.setOnClickListener{
            Navigation
                .findNavController(view)
                .navigate(R.id.action_secondFragment_to_homeFragment)
        }
        return view
    }

}