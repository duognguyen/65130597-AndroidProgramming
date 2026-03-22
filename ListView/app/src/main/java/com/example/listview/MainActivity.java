package com.example.listview;

import android.os.Bundle;import android.widget.ArrayAdapter;import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = new String[]{"Việt Nam", "Hàn Quốc", "Nhật Bản", "Đức", "Thụy Sĩ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}