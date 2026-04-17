package ntu.duongnguyen.projectmidtermexam;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang1 extends AppCompatActivity {
    Button checkResult;
    EditText getMonth, getYear;
    TextView setKq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang1);
        checkResult.setOnClickListener(v -> check());
    }
    public void check(){
        getMonth = findViewById(R.id.editTextThang);
        getYear = findViewById(R.id.editTextNam);
        setKq = findViewById(R.id.textViewKetQua);
        String month = getMonth.getText().toString();
        String year = getYear.getText().toString();

        String result;
        if(month.equals("4") && year.equals("1975")){
            result = "Ket qua chinh xac";
        } else if(!month.equals("4") && !year.equals("1975")){
            result = "Ket qua sai";
        } else if(!month.equals("4")){
            result = "Nam dung, sai thang";
        } else result = "Nam sai, thang dung";
        setKq.setText(result);
    }
}