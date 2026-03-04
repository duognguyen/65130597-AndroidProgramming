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
    EditText so1, so2;
    TextView kq;
    Button tinh;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        so1 = findViewById(R.id.editTextNumberDecimal1);
        so2 = findViewById(R.id.editTextNumberDecimal2);
        tinh = findViewById(R.id.button);
        kq = findViewById(R.id.textView4);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = so1.getText().toString();
                String s2 = so2.getText().toString();
                if(!s1.isEmpty() && !s2.isEmpty()){
                    double a = Double.parseDouble(s1);
                    double b = Double.parseDouble(s2);
                     double tong = a + b;

                     kq.setText("" + tong);
                } else{
                    kq.setText("Nhap lai");
                }
            }
        });
    }
}