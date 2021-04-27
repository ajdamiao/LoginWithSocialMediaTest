package com.example.firebaseteste.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.View
import com.example.firebaseteste.R


class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            openLoginFragment()
        },2000)
    }

    private fun openLoginFragment()
    {
        val ft = requireFragmentManager().beginTransaction()
        ft.replace(R.id.mainContent, LoginFragment())
        ft.commit()
    }
}