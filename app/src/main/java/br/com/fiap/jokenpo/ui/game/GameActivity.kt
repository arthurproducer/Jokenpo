package br.com.fiap.jokenpo.ui.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import br.com.fiap.jokenpo.R
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random

class GameActivity : AppCompatActivity(){

    private lateinit var gameViewModel: GameViewModel
    var playerChoise = 0
    var computerChoise = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gameViewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)


    btPedra.setOnClickListener {
        imgButtonChoice.setImageResource(R.drawable.pedra)
        playerChoise = 0
        pcRandomChoice()
        compare(playerChoise,pcRandomChoice())

    }
        btPapel.setOnClickListener {
            imgButtonChoice.setImageResource(R.drawable.papel)
            playerChoise = 1
            pcRandomChoice()
            compare(playerChoise,pcRandomChoice())


        }

        btTesoura.setOnClickListener {
            imgButtonChoice.setImageResource(R.drawable.tesoura)
            playerChoise = 2
            pcRandomChoice()
            compare(playerChoise,pcRandomChoice())

        }

    }

    private fun pcRandomChoice(): Int{
        //Randomicamente gera um número
        //dependendo do número é chamado um dos onClickListener

        var random = Random.nextInt(3)

        when (random) {
            0 -> imgPCChoise.setImageResource(R.drawable.pedra)
            1 -> imgPCChoise.setImageResource(R.drawable.papel)
            2 -> imgPCChoise.setImageResource(R.drawable.tesoura)
        }
        return random
    }

    private fun compare(playerChoice : Int, pcChoice:Int){

        when(playerChoice){
            0 ->{
                when(pcChoice){

                }
            }
            1 ->{
                when(pcChoice){

                }
            }
            2->{
                when(pcChoice){

                }
            }
        }

    }

}
