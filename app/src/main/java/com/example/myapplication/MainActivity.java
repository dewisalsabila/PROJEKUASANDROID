package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        LinearLayoutCompat absenmasuk = findViewById(R.id.absenmasuk);
        absenmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AbsenmasukActivity.class);
                startActivity(intent);
            }
        });
        LinearLayoutCompat izin = findViewById(R.id.izin);
        izin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IzinActivity.class);
                startActivity(intent);
            }
        });
        LinearLayoutCompat keluar = findViewById(R.id.cvAbsenKeluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AbsenkeluarActivity.class);
                startActivity(intent);
            }
        });
    }
}