package com.mihinduranasinghe.mychatapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

    btnSignup.setOnClickListener(){
        val intent = Intent(this,ThirdActivity::class.java)
        startActivity(intent)
    }

    }

}