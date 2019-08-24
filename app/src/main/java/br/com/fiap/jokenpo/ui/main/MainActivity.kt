package br.com.fiap.jokenpo.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.jokenpo.R
import br.com.fiap.jokenpo.ui.game.GameActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_StartGame.setOnClickListener {
            val nextScreen = Intent(this, GameActivity::class.java)
            startActivity(nextScreen)
        }

        btn_Sobre.setOnClickListener {

        }

        btn_Finish.setOnClickListener {
            finish()
        }
    }
}
