package com.fajarmush.customuserinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1, bil2, hasil;
    private Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    public void initUI() {
        bil1 = findViewById(R.id.bil_satu);
        bil2 = findViewById(R.id.bil_dua);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);
    }

    public void initEvent() {
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    public void hitungJumlah() {
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        hasil.setText(total + "");
    }
}