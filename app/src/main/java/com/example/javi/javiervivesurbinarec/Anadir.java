package com.example.javi.javiervivesurbinarec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Javi on 24/01/2018.
 */

public class Anadir extends AppCompatActivity {

    TextView tvNom, tvNum;
    EditText etNom, etNum;
    Button btGuar, btCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir);

        tvNom = findViewById(R.id.tvNom);
        tvNum = findViewById(R.id.tvNum);
        etNom = findViewById(R.id.etNom);
        etNom = findViewById(R.id.etNum);
        btGuar = findViewById(R.id.btGuar);
        btCancelar = findViewById(R.id.btCancelar);

        //CLICK BOTON GUARDAR
        btGuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lo que hace

            }
        });

        //CLICK BOTON CANCELAR
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lo que hace
                etNom.setText(" ");
                etNum.setText(" ");
            }
        });
    }
}
