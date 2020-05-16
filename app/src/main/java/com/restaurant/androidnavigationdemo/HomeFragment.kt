package com.restaurant.androidnavigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCtrl =  Navigation.findNavController(view)

        btnCreate.setOnClickListener {
            navCtrl.navigate(R.id.action_homeFragment_to_createProductFragment)
        }
        btnView.setOnClickListener {
            navCtrl.navigate(R.id.action_homeFragment_to_viewProductFragment)
        }
    }

}
