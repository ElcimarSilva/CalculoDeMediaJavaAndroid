package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nome = findViewById(R.id.editTextTextPersonName);
        Button botaoEnviar = (Button) findViewById((R.id.button));
        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeValue = Nome.getText().toString();

                Intent intent = new Intent (MainActivity.this, primeiranota.class);

                intent.putExtra("nome", nomeValue);
                startActivity(intent);
                finish();
            }
        });

    }


}