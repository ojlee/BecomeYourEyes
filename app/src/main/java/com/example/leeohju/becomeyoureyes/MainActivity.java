package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCos = (Button) findViewById(R.id.btnCos);
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CosActivity.class);
                startActivity(intent);
            }
        });
        Button btnSet = (Button) findViewById(R.id.btnSet);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SetActivity.class);
                startActivity(intent);
            }
        });
        Button btnEme = (Button) findViewById(R.id.btnEme);
        btnEme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmeActivity.class);
                startActivity(intent);
            }
        });
    }
}
