package com.example.javi.javiervivesurbinarec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    Button btAnadir;
    Button btListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         btAnadir = findViewById(R.id.btAnadir);
         btListar = findViewById(R.id.btListar);

        contactos = new ArrayList<Contacto>();

        btAnadir.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent inte = new Intent(getApplicationContext(), Anadir.class);
                startActivity(inte);

            }
        });

        btListar.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent inte = new Intent(getApplicationContext(), Anadir.class);
                startActivity(inte);

            }
        });


    }
}
