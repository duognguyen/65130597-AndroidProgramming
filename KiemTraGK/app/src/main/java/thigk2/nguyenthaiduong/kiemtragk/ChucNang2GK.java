package thigk2.nguyenthaiduong.kiemtragk;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2GK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2_gk);
        String[] values = new String[]{"Nhac A", "Nhac B", "Nhật Bản", "Đức", "Nhac C", "Nhac D" , "Nhac E", "Nhac F", "Nguyễn Thái Dương"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}