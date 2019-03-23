package niebieskaorka.boradgames.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import niebieskaorka.boradgames.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        var e_user_email = findViewById<TextView>(R.id.user_email)
        var e_user_pwd = findViewById<TextView>(R.id.user_password)
        var register_text = findViewById<TextView>(R.id.register_text)
        var btn_login = findViewById<TextView>(R.id.login_button)

        btn_login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        register_text.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
