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
    }
    // Hàm xử lí cộng
    public void xuLiCong(View v){
        // Lấy dữ liệu số
        // Tìm edit text số 1 và edit text só 2
        EditText ed1 = findViewById(R.id.edtSo1);
        EditText ed2 = findViewById(R.id.edtSo2);

        // Lấy dữ liệu từ 2  điều khiển đó
        String so1 = ed1.getText().toString();
        String so2 = ed2.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang số
        double soA = Double.parseDouble(so1);
        double soB = Double.parseDouble(so2);

        // Tính toán
        double tong = soA + soB;

        // Hiện kết quả
        EditText kq = findViewById(R.id.edtSo3);

        // Chuyển kết quả tính được thành chuỗi
        String ketQua = String.valueOf(tong);

        // Gắn kết quả lên điều khiển
        kq.setText(ketQua);
    }
    public void XuLiTru(View v){
        EditText ed1 = findViewById(R.id.edtSo1);
        EditText ed2 = findViewById(R.id.edtSo2);

        // Lấy dữ liệu từ 2  điều khiển đó
        String so1 = ed1.getText().toString();
        String so2 = ed2.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang số
        double soA = Double.parseDouble(so1);
        double soB = Double.parseDouble(so2);

        // Tính toán
        double tong = soA - soB;

        // Hiện kết quả
        EditText kq = findViewById(R.id.edtSo3);

        // Chuyển kết quả tính được thành chuỗi
        String ketQua = String.valueOf(tong);

        // Gắn kết quả lên điều khiển
        kq.setText(ketQua);
    }
    public void XuLiNhan(View v){
        EditText ed1 = findViewById(R.id.edtSo1);
        EditText ed2 = findViewById(R.id.edtSo2);

        // Lấy dữ liệu từ 2  điều khiển đó
        String so1 = ed1.getText().toString();
        String so2 = ed2.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang số
        double soA = Double.parseDouble(so1);
        double soB = Double.parseDouble(so2);

        // Tính toán
        double tong = soA * soB;

        // Hiện kết quả
        EditText kq = findViewById(R.id.edtSo3);

        // Chuyển kết quả tính được thành chuỗi
        String ketQua = String.format("%.2f", tong);
        // Gắn kết quả lên điều khiển
        kq.setText(ketQua);
    }
    public void XuLiChia(View v){
        EditText ed1 = findViewById(R.id.edtSo1);
        EditText ed2 = findViewById(R.id.edtSo2);

        // Lấy dữ liệu từ 2  điều khiển đó
        String so1 = ed1.getText().toString();
        String so2 = ed2.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang số
        double soA = Double.parseDouble(so1);
        double soB = Double.parseDouble(so2);

        // Tính toán
        double tong = soA / soB;

        // Hiện kết quả
        EditText kq = findViewById(R.id.edtSo3);

        // Chuyển kết quả tính được thành chuỗi
        String ketQua = String.format("%.2f", tong);

        // Gắn kết quả lên điều khiển
        kq.setText(ketQua);
    }

}