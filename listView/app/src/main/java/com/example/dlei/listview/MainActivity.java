package com.example.dlei.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lv_Equipes);
        ArrayAdapter adapter = new EscolaAdapter(this, adicionarEscolas());
        lista.setAdapter(adapter);
    }

        private ArrayList<Escola> adicionarEscolas(){
            ArrayList<Escola> escolas = new ArrayList<Escola>();

            Escola e = new Escola("Colégio Estadual Atheneu Sergipense",
                    "Rua Pacatuba S/N", R.drawable.escola1);
            escolas.add(e);
            e = new Escola("Escola Estadual General Siqueira",
                    "Rua Sergipe S/N", R.drawable.escola2);
            escolas.add(e);
            e = new Escola("Escola  Siqueira",
                    "Rua Sergipe S/N", R.drawable.escola3);
            escolas.add(e);

            e = new Escola("Escola  Atheneu Siqueira",
                    "Rua Sergipe S/N", R.drawable.escola4);
            escolas.add(e);

            e = new Escola("Escola  Kilindu Siqueira",
                        "Rua Sergipe S/N", R.drawable.escola5);
            escolas.add(e);

            return escolas;

        }
}

