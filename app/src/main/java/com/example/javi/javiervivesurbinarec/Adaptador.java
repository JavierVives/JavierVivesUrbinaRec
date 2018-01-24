package com.example.javi.javiervivesurbinarec;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Javi on 24/01/2018.
 */

public class Adaptador extends BaseAdapter {

    Context contexto;
    ArrayList<Contacto> arrayContacto;

    //CONSTRUCTOR
    public Adaptador(Context contexto, ArrayList<Contacto> arrayContacto) {
        this.contexto = contexto;
        this.arrayContacto = arrayContacto;
    }

    @Override
    public int getCount() {
        return arrayContacto.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayContacto.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //INFLO LA VISTA
        View vista = view;
        LayoutInflater inflate =LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.listview_item, null);

        //PONGO EN EL DISEÑO TODOS LOS VALORES DEL PRODUCTO
        TextView tvNombre = vista.findViewById(R.id.tvNombre);
        TextView tvNumero = vista.findViewById(R.id.tvNumero);

        tvNombre.setText(arrayContacto.get(i).getNombre().toString());
        tvNombre.setText(arrayContacto.get(i).getNumero().toString());

        //RETORNO LA VISTA
        return vista;
    }
}
