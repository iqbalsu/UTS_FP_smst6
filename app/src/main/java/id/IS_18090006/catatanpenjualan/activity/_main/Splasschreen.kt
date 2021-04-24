package id.IS_18090006.catatanpenjualan.activity._main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import id.IS_18090006.catatanpenjualan.R
import id.IS_18090006.catatanpenjualan.activity.login.LoginActivity

class Splasschreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splasschreen)
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
        }, 1000)
    }
}