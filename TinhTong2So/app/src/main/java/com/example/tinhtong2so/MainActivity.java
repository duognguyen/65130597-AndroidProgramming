package com.example.tinhtong2so;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    EditText ed1;
    EditText ed2;
    EditText edKq;
    Button nutCong, nutTru, nutNhan, nutChia;
    void timDieuKhien(){
        ed1 = findViewById(R.id.edtSo1);
        ed2 = findViewById(R.id.edtSo2);
        edKq = findViewById(R.id.edtSo3);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDieuKhien();
        View.OnClickListener boLangNghe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULI_CONG();
            }
        };
        nutCong.setOnClickListener(boLangNghe);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = ed1.getText().toString();
                String s2 = ed2.getText().toString();
                double so1 = Double.parseDouble(s1);
                double so2 = Double.parseDouble(s2);
                double tong = so1 - so2;
                String chuoiKq = String.valueOf(tong);
                edKq.setText(chuoiKq);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULI_NHAN();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULI_CHIA();
            }
        });
    }

    void XULI_CONG(){
        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();
        double so1 = Double.parseDouble(s1);
        double so2 = Double.parseDouble(s2);
        double tong = so1 + so2;
        String chuoiKq = String.valueOf(tong);
        edKq.setText(chuoiKq);
    }
    void XULI_NHAN(){
        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();
        double so1 = Double.parseDouble(s1);
        double so2 = Double.parseDouble(s2);
        double tong = so1 * so2;
        String chuoiKq = String.valueOf(tong);
        edKq.setText(chuoiKq);
    }
    void XULI_CHIA(){
        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();
        double so1 = Double.parseDouble(s1);
        double so2 = Double.parseDouble(s2);
        double tong = so1 / so2;
        String chuoiKq = String.valueOf(tong);
        edKq.setText(chuoiKq);
    }
}