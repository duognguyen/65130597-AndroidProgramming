package duongnguyen.weddingapp.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import duongnguyen.weddingapp.R;
import duongnguyen.weddingapp.adapters.SanhTiecAdapter;
import duongnguyen.weddingapp.models.SanhTiec;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvSanhTiec;

    ArrayList<SanhTiec> listSanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvSanhTiec = findViewById(R.id.rcvSanhTiecs);
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance("https://weddingapp-8f5aa-default-rtdb.asia-southeast1.firebasedatabase.app/");
        DatabaseReference myRef = database.getReference("SanhTiec");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listSanh = new ArrayList<>();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    SanhTiec sanh = snapshot.getValue(SanhTiec.class);
                    listSanh.add(sanh);
                }
                SanhTiecAdapter adapter = new SanhTiecAdapter(MainActivity.this, listSanh);
                rcvSanhTiec.setAdapter(adapter);
                rcvSanhTiec.setLayoutManager(new LinearLayoutManager(MainActivity.this));

            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.e("FIREBASE", "Lỗi lấy dữ liệu: " + error.getMessage());
            }
        });
    }
}