package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonc = findViewById<Button>(R.id.BtnVuelta)
        val reiniciar = findViewById<Button>(R.id.BtnReiniciar)
        val contador = findViewById<TextView>(R.id.TextCou)
        var contar = 0;

        buttonc.setOnClickListener {
            contar += 1
            contador.text = contar.toString();

            if (contar == 10){
                Toast.makeText(this, "Lleva 10 vueltas!", Toast.LENGTH_LONG).show()
                IMG1.setImageResource(R.drawable.trofeo1)
            }
            if (contar == 11){
                IMG1.setImageDrawable(null)
            }

            if (contar == 20){
                Toast.makeText(this, "Completaste tus 20 vueltas!", Toast.LENGTH_LONG).show()
                IMG1.setImageResource(R.drawable.trofeo2)

            }
            when {
                20 < contar -> contador.text = "20"

            }
        }

        reiniciar.setOnClickListener {
            contar = 0
            contador.text = contar.toString();
            IMG1.setImageDrawable(null)
        }
    }
}
