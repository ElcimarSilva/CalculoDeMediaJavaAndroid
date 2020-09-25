package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class primeiranota extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiranota);

        editTextNumber = (EditText) findViewById((R.id.editTextNumber));
        editTextNumber2 = (EditText) findViewById((R.id.editTextNumber2));

    }

    public void calcularMedia(View v){

        float nota1 = Float.parseFloat(editTextNumber.getText().toString());
        float nota2 = Float.parseFloat(editTextNumber2.getText().toString());

        float media = (nota1+nota2) /2;

        Intent i = new Intent (this, resultado.class);
        i.putExtra("media", media);
        final String nome = (String) getIntent().getExtras().get("nome");
        i.putExtra("nome", nome);
        startActivity(i);

    }
}