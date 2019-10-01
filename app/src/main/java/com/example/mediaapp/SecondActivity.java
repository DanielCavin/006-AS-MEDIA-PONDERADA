package com.example.mediaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvMedia;
    private TextView tStatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvMedia = findViewById(R.id.tvMedia);
        tStatos = findViewById(R.id.tStatos);

        Bundle dados = getIntent().getExtras();
        int media = dados.getInt("media");

        tvMedia.setText( String.valueOf( media ));

        if(media > 8){
            tStatos.setText("Parabens Você é um aluno classe Cavin Muito Brabo");
        }else{
            tStatos.setText("Voce ainda nao é tao top assim , vai estudar!!!");
        }
    }
}

