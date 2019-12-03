package com.example.bulldogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre;
    EditText correo;
    EditText contra;
    EditText contra2;
    Button registrarse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.etNombre);
        correo = findViewById(R.id.etCorreo);
        contra = findViewById(R.id.etPassword);
        contra2 = findViewById(R.id.etPassword2);
        registrarse = findViewById(R.id.btnregistrar);

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrar();
            }
        });

    }

    public void registrar(){
        String nom;
        String cor;
        String con;
        String con2;

        nom = nombre.getText().toString();
        cor = correo.getText().toString();
        con = contra.getText().toString();
        con2 = contra2.getText().toString();

        if(nom.isEmpty() ||cor.isEmpty() || con.isEmpty() || con2.isEmpty()){
            if (nom.isEmpty()){
                nombre.setError("Llenar campo");
            }

            if (cor.isEmpty()){
                correo.setError("Llenar campo");
            }

            if (con.isEmpty()){
                contra.setError("Llenar campo");
            }

            if (con2.isEmpty()){
                contra2.setError("Llenar campo");
            }

        }else{
            if(con.equals(con2)){
                Toast.makeText(this, "Usuario Registrado", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
