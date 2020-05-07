package com.example.diceroller
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val loginButton:Button=findViewById(R.id.login_button)
        loginButton.setOnClickListener{
            showText(it)
        }
    }

    private fun showText(view: View) {
        val emailField : TextView =findViewById<TextView>(R.id.email)
        val passwordField :TextView=findViewById<TextView>(R.id.pass_text)
        var email =emailField.text
        var password =passwordField.text
        Toast.makeText(this,"Email: " +email+ " \nPassword:" + password, Toast.LENGTH_LONG).show()

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
