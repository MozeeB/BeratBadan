package com.example.mozeeb.beratbadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //extend merupakan inheritance
    Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnHitung = findViewById(R.id.btn_hitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HitungActivity.class));
            }
        });
    }
    //method onclick, View view sebagai paramater
    public void tentang(View view) {
        startActivity(new Intent(MainActivity.this, TentangActivity.class));
    }

    public void hitung(View view) {
        Intent intent = new Intent(MainActivity.this,HitungActivity.class);
        startActivity(intent);
    }
}