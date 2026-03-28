package duongnguyen.appmonan;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tìn listView
        ListView lvDSMonAn = findViewById(R.id.dsMonAn);

        //Chuẩn bị nguồn dữ liệu
        ArrayList<MonAn> Menu = new ArrayList<MonAn>();
        Menu.add(new MonAn("Phở", 40000, "Phở bò", R.drawable.pho));
        Menu.add(new MonAn("Bánh mì", 20000, "Bánh mì ốp la", R.drawable.banhmi));
        Menu.add(new MonAn("Bánh xèo", 30000, "Bánh xèo mực", R.drawable.banhxeo));
        Menu.add(new MonAn("Cơm sườn", 30000, "Cơm, sườn, bì, chả", R.drawable.consuon));
        Menu.add(new MonAn("Xôi", 15000, "Xôi thập cẩm", R.drawable.xoi));

        MonAnAdapter adapter = new MonAnAdapter(this, Menu);
        lvDSMonAn.setAdapter(adapter);

        //Bắt xử lí sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAn = Menu.get(position);
                Toast.makeText(MainActivity.this, monAn.getTenMonAn(), LENGTH_SHORT).show();
            }
        });
    }
}