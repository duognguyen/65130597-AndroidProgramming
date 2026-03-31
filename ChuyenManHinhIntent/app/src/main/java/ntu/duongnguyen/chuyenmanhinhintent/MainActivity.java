package ntu.duongnguyen.chuyenmanhinhintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnChuyenManHinhPhu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChuyenManHinhPhu = findViewById(R.id.buttonChuyenManHinhPhu);
        btnChuyenManHinhPhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenManHinh(v);
            }
        });
    }
    public void chuyenManHinh(View v){
        Intent iManHinhKhac = new Intent(this, SubActivity.class);
        startActivity(iManHinhKhac);
    }
}