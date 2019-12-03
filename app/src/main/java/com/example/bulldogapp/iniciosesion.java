package com.example.bulldogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iniciosesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciosesion);
    }
    public void registrarse(View view){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
