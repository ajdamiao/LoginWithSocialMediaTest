package com.example.firebaseteste.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firebaseteste.R
import com.example.firebaseteste.databinding.FragmentHomeBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.btnLogOut.setOnClickListener {
            logout()
            getLoginFragment()
        }
    }

    private fun logout()
    {
        Firebase.auth.signOut()
    }

    private fun getLoginFragment()
    {
        val ft = requireFragmentManager().beginTransaction()
        ft.replace(R.id.mainContent, LoginFragment())
        ft.commit()
    }

}