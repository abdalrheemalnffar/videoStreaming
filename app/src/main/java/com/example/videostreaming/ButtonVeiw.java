package com.example.videostreaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonVeiw extends AppCompatActivity {

    Button vedioOne;
    Button vedioTow;
    Button vedioThree;
    Button vedioFoure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonveiw);

        vedioOne = findViewById(R.id.vedioOne);
        vedioTow = findViewById(R.id.vedioTow);
        vedioThree = findViewById(R.id.vedioThree);
        vedioFoure = findViewById(R.id.vedioFoure);

        vedioOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        vedioTow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vedio22.class);
                startActivity(intent);
            }
        });

        vedioThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vedio33.class);
                startActivity(intent);
            }
        });

        vedioFoure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vedio44.class);
                startActivity(intent);
            }
        });


    }
}
