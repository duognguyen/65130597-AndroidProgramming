package ntu.duongnguyen.projectmidtermexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, btAboutMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.chucNang1);
        bt2 = findViewById(R.id.chucNang2);
        bt3 = findViewById(R.id.chucNang3);
        btAboutMe = findViewById(R.id.aboutMe);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyenManHinhChucNang1(v);
            }
        });
        bt2.setOnClickListener(v -> chuyenManHinhChucNang2(v));
        bt3.setOnClickListener(v -> chuyenManHinhChucNang3(v));
        btAboutMe.setOnClickListener(v -> chuyenManHinhChucNang4(v));
    }

    public void chuyenManHinhChucNang1(View v){
        Intent manhinh1= new Intent(this, ChucNang1.class);
        startActivity(manhinh1);
    }
    public void chuyenManHinhChucNang2(View v){
        Intent manhinh2 = new Intent(this, ChucNang2.class);
        startActivity(manhinh2);
    }
    public void chuyenManHinhChucNang3(View v){
        Intent manhinh3 = new Intent(this, ChucNang3.class);
        startActivity(manhinh3);
    }
    public void chuyenManHinhChucNang4(View v){
        Intent manhinh4 = new Intent(this, AboutMe.class);
        startActivity(manhinh4);
    }

}