package com.mChavez.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confir);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String email = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion = parametros.getString(getResources().getString(R.string.pdescripcion));
        String año = parametros.getString(getResources().getString(R.string.paño));
        String mes = parametros.getString(getResources().getString(R.string.pmes));
        String dia = parametros.getString(getResources().getString(R.string.pdia));

        TextView cnombre = (TextView) findViewById(R.id.c_nombre);
        TextView cfecha = (TextView) findViewById(R.id.c_fecha);
        TextView ctelefono = (TextView) findViewById(R.id.c_telefono);
        TextView cemail = (TextView) findViewById(R.id.c_email);
        TextView cdescripcion = (TextView) findViewById(R.id.c_descripcion);
        Button boton2 = (Button) findViewById(R.id.boton2);

        cnombre.setText(nombre);
        cfecha.setText("Fecha de nacimiento: " + dia + "/" + mes + "/" + año);
        ctelefono.setText(("Tel: ") + telefono);
        cemail.setText("Email: " + cemail);
        cdescripcion.setText("Descripcion: " + cdescripcion);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}