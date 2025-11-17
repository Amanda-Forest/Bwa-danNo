package com.example.bwadanno

import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Declare our variables
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val btn = findViewById<View>(R.id.flashcard_answer2)
        val btn3 = findViewById<View>(R.id.flashcard_answer3)

        val eyesView = findViewById<ImageView>(R.id.imageVisible)
        val eyesUvisib = findViewById<ImageView>(R.id.imageInvisible)

        // function that make the answer visible
        eyesView.setOnClickListener {
            flashcardAnswer.visibility = View.VISIBLE
            flashcardQuestion.visibility = View.VISIBLE
            btn.visibility= View.VISIBLE
            btn3.visibility = View.VISIBLE
            eyesUvisib.visibility = View.VISIBLE
            eyesView.visibility = View.INVISIBLE
        }

        eyesUvisib.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer.visibility = View.INVISIBLE
            btn.visibility= View.INVISIBLE
            btn3.visibility = View.INVISIBLE
            eyesView.visibility = View.VISIBLE
            eyesUvisib.visibility = View.INVISIBLE

        }

        btn.setOnClickListener{
            btn.setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
            flashcardAnswer.setBackgroundColor(getResources().getColor(R.color.my_green_color, null))

        }
        flashcardAnswer.setOnClickListener{
            flashcardAnswer.setBackgroundColor(getResources().getColor(R.color.my_green_color, null))

        }
        btn3.setOnClickListener{
            btn.setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
            flashcardAnswer.setBackgroundColor(getResources().getColor(R.color.my_green_color, null))
        }
    }

}
