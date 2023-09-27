package com.jailson.appfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.jailson.appfirebase.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var googleSigninClient: GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        val text_botao_logar_goolgle = binding.bgBotangoogle.getChildAt(0) as TextView
        text_botao_logar_goolgle.text  = "Fazer login com o Google"
    }
}