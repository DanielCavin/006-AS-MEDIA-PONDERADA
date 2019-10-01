package com.example.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  TextView pNumero;
    private TextView sNumero;
    private TextView tNumero;
    private Button bButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pNumero = findViewById(R.id.pNumero);
        sNumero = findViewById(R.id.sNumero);
        tNumero = findViewById(R.id.tNumero);
        bButton = findViewById(R.id.bButton);

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Capturar a idade que está no EditText e converter para int

                int n1 = Integer.parseInt(pNumero.getText().toString() );
                int n2 = Integer.parseInt(sNumero.getText().toString() );
                int n3 = Integer.parseInt(tNumero.getText().toString() );

                int media = (n1 + n2+ n3)/3;

                //Criar Intent que vai iniciar a SegundaActivity
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                //Passar dados pela intent
                intent.putExtra("media", media);

                //Iniciar a intent.
                startActivity(intent);
            }

        });
    }
}

