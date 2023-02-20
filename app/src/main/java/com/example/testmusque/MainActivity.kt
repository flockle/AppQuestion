package com.example.testmusque

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testmusque.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var rightAnswer: String? = null
    private val musData = mutableListOf("Major 3rd","Minor 3rd","Diminished 3rd","Augmented 3rd")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        fun showNextQue(){
            // this set the question
            val quiz = musData[0]

            binding.quetion_pic1.text = quiz[0]
            rightAnswer = musData[1]
            binding.answerBtn1.text = quiz[1].toString()
            binding.answerBtn1.text = quiz[2].toString()
            binding.answerBtn3.text = quiz[3].toString()
            binding.answerBtn4.text = quiz[4].toString()


        }
        fun  checkAnswer() {
            val answerBtn: Button =findViewById(view.id)
            val btnText =answerBtn.text.toString()

            val aT: String

            if (btnText ==rightAnswer){
                aT ="Great Job!"
            } else{
                aT = "Sorry, Your answer is incorrect"
            }

        }



    }
}