package thigk2.nguyenthaiduong.kiemtragk;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChucNang3GK extends AppCompatActivity {

    RecyclerView recyclerViewChucNang3;
    ArrayList<DanhNhan> hoatDongs;
    DanhNhanAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3_gk);
        recyclerViewChucNang3 = findViewById(R.id.rcView);
        hoatDongs = new ArrayList<>();
        hoatDongs.add(new DanhNhan("img", "Nguyen Van A", "PY"));
        hoatDongs.add(new DanhNhan("img", "Nguyen Van B", "NT"));
        hoatDongs.add(new DanhNhan("img", "Nguyen Van C", "SG"));
        hoatDongs.add(new DanhNhan("img", "Nguyen Van D", "HN"));
        adapter = new DanhNhanAdapter(this, hoatDongs);
        recyclerViewChucNang3.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewChucNang3.setAdapter(adapter);
    }
}