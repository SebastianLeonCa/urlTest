package com.example.pc1dam21100165

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity {

    class LoginActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_login)

            val usernameEditText: EditText = findViewById(R.id.usernameEditText)
            val passwordEditText: EditText = findViewById(R.id.passwordEditText)
            val loginButton: Button = findViewById(R.id.loginButton)

            loginButton.setOnClickListener {
                val username = usernameEditText.text.toString()
                val password = passwordEditText.text.toString()

                // Aquí puedes implementar tu lógica de validación de login
                if (username == "admin" && password == "1234") {
                    // Si las credenciales son correctas, navega al MainActivity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish() // Finaliza LoginActivity para que el usuario no pueda volver con el botón de retroceso
                } else {
                    // Muestra un mensaje de error si las credenciales no son correctas
                    Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}