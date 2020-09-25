package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    TextView textView6;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textView6 = (TextView)findViewById(R.id.textView6);
        textView4 = (TextView)findViewById(R.id.textView4);

        Intent i = getIntent();
        float media = i.getFloatExtra("media", 0f);
        String nome =i.getStringExtra("nome");
        String situação = null;
        if (media >=6)
            situação = "Aprovado";
        else
            situação = "Reprovado";
        String msg = "Você foi " + situação + " com media " + media;

        textView4.setText(nome);
        textView6.setText(msg);


    }

}