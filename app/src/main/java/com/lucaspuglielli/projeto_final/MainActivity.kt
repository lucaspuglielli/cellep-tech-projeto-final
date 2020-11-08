package com.lucaspuglielli.projeto_final

//import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener {
            val altura = edtAltura.text.toString().trim()
            val peso = edtPeso.text.toString().trim()

            if (altura.isEmpty() || peso.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show()
            }
            else {

                val result:Double = peso.toDouble() / (( altura.toDouble() / 100 ) * ( altura.toDouble() / 100 ))

                val mIntent = Intent(this, ResultActivity::class.java)

                mIntent.putExtra("INTENT_RESULT", result)

                startActivity(mIntent)

                finishAffinity()
            }
        }
    }
}