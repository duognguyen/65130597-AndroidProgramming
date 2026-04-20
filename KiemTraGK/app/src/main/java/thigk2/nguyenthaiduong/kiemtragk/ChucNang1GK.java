package thigk2.nguyenthaiduong.kiemtragk;

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

public class ChucNang1GK extends AppCompatActivity {
    EditText tienNhap;
    TextView tienDoi;
    Button btdoiTien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang1_gk);
        btdoiTien = findViewById(R.id.buttonTien);
        tienNhap = findViewById(R.id.editTextTien);
        tienDoi = findViewById(R.id.editTextsetTien);
        btdoiTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tien = tienNhap.getText().toString();
                int sotien = Integer.parseInt(tien);
                int kq = sotien / 23000;
                String kqtien = String.valueOf(kq);
                tienDoi.setText(kqtien);
            }
        });
    }

}