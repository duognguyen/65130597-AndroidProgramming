package ntu.duongnguyen.projectmidtermexam;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChucNang2 extends AppCompatActivity {
    RecyclerView recyclerViewChucNang2;
    ArrayList<Song> listSong;
    AdapterNhac adapterNhac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);
        RecyclerView rcv = findViewById(R.id.recycleViewNhac);
        listSong = new ArrayList<>();
        listSong.add(new Song("Tiến về Sài Gòn"));
        listSong.add(new Song("Giải phóng miền Nam"));
        listSong.add(new Song("Đất nước trọn niềm vui"));
        listSong.add(new Song("Bài ca thống nhất"));
        listSong.add(new Song("Mùa xuân trên TP TCM"));
        listSong.add(new Song("..."));
        adapterNhac = new AdapterNhac(this, listSong);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(adapterNhac);
    }
}