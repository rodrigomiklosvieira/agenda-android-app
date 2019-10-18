package br.com.etecia.agenda_app.activity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.List;

import br.com.etecia.agenda_app.R;
import br.com.etecia.agenda_app.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Rodrigo Miklos");

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("Paulo Henrique");

        Pessoa pessoa03 = new Pessoa();
        pessoa03.setNome("Marcelo Bertizini");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        pessoas.add(pessoa03);


        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pessoas);
        listView.setAdapter(adapter);

    }
}
