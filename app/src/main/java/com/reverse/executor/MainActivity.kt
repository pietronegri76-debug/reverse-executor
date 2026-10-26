package com.reverse.executor

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val codeInput: EditText = findViewById(R.id.codeInput)
        val scriptInput: EditText = findViewById(R.id.scriptInput)
        val executeBtn: Button = findViewById(R.id.executeBtn)

        executeBtn.setOnClickListener {
            val code = codeInput.text.toString()
            val script = scriptInput.text.toString()

            if (code == "1910") {
                if (script.isNotEmpty()) {
                    val success = NativeExecutor.injectAndExecute(script)
                    if (success) {
                        Toast.makeText(this, "reverse: Script Iniettato!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Iniezione fallita. Shizuku attivo?", Toast.LENGTH_LONG).show()
                    }
                } else {
                    Toast.makeText(this, "Inserisci uno script.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Codice 1910 errato.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
