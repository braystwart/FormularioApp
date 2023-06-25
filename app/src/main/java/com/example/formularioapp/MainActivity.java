package com.example.formularioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Borrar(View view) {
        EditText Cedula = findViewById(R.id.txtCedula);
        EditText Nombres = findViewById(R.id.txtNombres);
        CalendarView FechaNac = findViewById(R.id.cvFecha);
        RadioButton Masculino = findViewById(R.id.rbMasculino);
        RadioButton Femenino = findViewById(R.id.rbFemenino);
        EditText Ciudad = findViewById(R.id.txtCiudad);
        EditText Correo = findViewById(R.id.txtCorreo);
        EditText Telefono = findViewById(R.id.txtTelefono);

        Cedula.setText("");
        Nombres.setText("");
        Masculino.setChecked(false);
        Femenino.setChecked(false);
        Ciudad.setText("");
        Correo.setText("");
        Telefono.setText("");
    }

    public void EnviarDatos(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText Cedula = findViewById(R.id.txtCedula);
        EditText Nombres = findViewById(R.id.txtNombres);
        CalendarView FechaNac = findViewById(R.id.cvFecha);
        RadioButton Masculino = findViewById(R.id.rbMasculino);
        RadioButton Femenino = findViewById(R.id.rbFemenino);
        EditText Ciudad = findViewById(R.id.txtCiudad);
        EditText Correo = findViewById(R.id.txtCorreo);
        EditText Telefono = findViewById(R.id.txtTelefono);

        String cedula = Cedula.getText().toString();
        String nombre = Nombres.getText().toString();
        String fechaNac = String.valueOf(FechaNac.getDate());
        RadioButton rbMascu = (RadioButton) findViewById(R.id.rbMasculino);
        String genero;
        if (rbMascu.isChecked())
            genero = "Masculino";
        else
            genero = "Femenino";
        String ciudad = Ciudad.getText().toString();
        String correo = Correo.getText().toString();
        String telefono = Telefono.getText().toString();

        Bundle b = new Bundle();
        startActivity(intent);
        b.putString("CEDULA", Cedula.getText().toString());
        b.putString("NOMBRES", Nombres.getText().toString());
        b.putString("FECHA NAC", fechaNac.toString());
        b.putString("GENERO", genero.toString());
        b.putString("CIUDAD", Ciudad.getText().toString());
        b.putString("CORREO", Correo.getText().toString());
        b.putString("TELEFONO", Telefono.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }


}