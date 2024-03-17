package com.example.lektion_9_navigationgraph

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.navigation.Navigation


class HomeFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      val view= inflater.inflate(R.layout.fragment_home,container,false)
        //components / widgets
       val flHomeFragment: FrameLayout = view.findViewById(R.id.fl_homepage_fragment)
        //listeners

        flHomeFragment.setOnClickListener {
            Navigation
                .findNavController(view)
                .navigate(R.id.action_homeFragment_to_firstFragment)
        }

        return view
    }

}