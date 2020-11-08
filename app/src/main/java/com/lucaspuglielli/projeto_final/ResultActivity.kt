package com.lucaspuglielli.projeto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getDoubleExtra("INTENT_RESULT", 0.0)

        val resReduzido = String.format("%.2f", result)

        edtScore.text = "$resReduzido"

        if (result >= 0 && result < 17) {
            edtFaixa.text = "Muito abaixo do peso."
        } else if (result >= 17 && result < 18.5) {
            edtFaixa.text = "Abaixo do peso."
        } else if (result >= 18.5 && result < 25) {
            edtFaixa.text = "Peso normal."
        } else if (result >= 25 && result < 30) {
            edtFaixa.text = "Acima do peso."
        } else if (result >= 30 && result < 35) {
            edtFaixa.text = "Obesidade I."
        } else if (result >= 35 && result < 40) {
            edtFaixa.text = "Obesidade II(severa)."
        } else if (result >= 40) {
            edtFaixa.text = "Obesidade III(mórbida)."
        }


        btnVoltar.setOnClickListener {
            val mIntent = Intent(this, MainActivity::class.java)

            startActivity(mIntent)

            finishAffinity()
        }

    }
}