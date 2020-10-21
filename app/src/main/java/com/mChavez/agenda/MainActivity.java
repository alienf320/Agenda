package com.mChavez.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button boton;
    DatePicker fecha;
    TextInputLayout nombre2;
    TextInputLayout telefono2;
    TextInputLayout email2;
    TextInputLayout descripcion2;
    String dpYear, dMonth, dDayOfMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton1);
        fecha = (DatePicker) findViewById(R.id.fecha1);
        nombre2 = (TextInputLayout) findViewById(R.id.nombre);
        telefono2 = (TextInputLayout) findViewById(R.id.telefono);
        email2 = (TextInputLayout) findViewById(R.id.email);
        descripcion2 = (TextInputLayout) findViewById(R.id.descripion);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Asigna valores.
                dpYear = String.valueOf(fecha.getYear());
                dMonth = String.valueOf(fecha.getMonth());
                dDayOfMonth = String.valueOf(fecha.getDayOfMonth());

                Intent intent = new Intent(MainActivity.this, confir.class);
                intent.putExtra(getResources().getString(R.string.pnombre), nombre2.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.ptelefono), telefono2.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.pemail), email2.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.pdescripcion), descripcion2.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.paño), dpYear);
                intent.putExtra(getResources().getString(R.string.pmes), dMonth);
                intent.putExtra(getResources().getString(R.string.pdia), dDayOfMonth);
                startActivity(intent);
            }
        });
    }
}