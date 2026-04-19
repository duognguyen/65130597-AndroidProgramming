package ntu.duongnguyen.projectmidtermexam;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChucNang3 extends AppCompatActivity {
    RecyclerView recyclerViewChucNang3;
    ArrayList<HoatDong> hoatDongs;
    HoatDongAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);
        recyclerViewChucNang3 = findViewById(R.id.rcView);
        hoatDongs = new ArrayList<>();
        hoatDongs.add(new HoatDong("img", "Thi giữa kì", "20/4"));
        hoatDongs.add(new HoatDong("img", "Thi cuối kì", "20/6"));
        hoatDongs.add(new HoatDong("img", "Chào đoán tân sinh viên", "30/8"));
        hoatDongs.add(new HoatDong("img", "Khai giảng", "5/9"));
        adapter = new HoatDongAdapter(this, hoatDongs);
        recyclerViewChucNang3.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewChucNang3.setAdapter(adapter);
    }
}