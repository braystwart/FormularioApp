package com.example.formularioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Saludo = (TextView)findViewById(R.id.txtMensaje);
        Bundle bundle = this.getIntent().getExtras();
        Saludo.setText("Hola!, Sus datos son: \n " +
                bundle.getString("CEDULA") + "\n" +
                bundle.getString("NOMBRES") + "\n" +
                bundle.getString("FECHA NAC") + "\n" +
                bundle.getString("GENERO") + "\n" +
                bundle.getString("CIUDAD") + "\n" +
                bundle.getString("CORREO") + "\n" +
                bundle.getString("TELEFONO"));
    }
}