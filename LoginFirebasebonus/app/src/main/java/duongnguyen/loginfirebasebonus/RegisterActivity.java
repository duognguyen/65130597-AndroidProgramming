package duongnguyen.loginfirebasebonus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText email, password;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        auth = FirebaseAuth.getInstance();

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        registerBtn = findViewById(R.id.btn_register);

        registerBtn.setOnClickListener(v -> {

            String emailText = email.getText().toString();
            String passwordText = password.getText().toString();

            if (!emailText.isEmpty() && !passwordText.isEmpty()) {
                registerUser(emailText, passwordText);
            } else {
                Toast.makeText(
                        RegisterActivity.this,
                        "Please fill in all fields",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }

    private void registerUser(String email, String password) {

        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {

                    if (task.isSuccessful()) {

                        Toast.makeText(
                                RegisterActivity.this,
                                "Registration Successful",
                                Toast.LENGTH_SHORT
                        ).show();

                        startActivity(
                                new Intent(RegisterActivity.this, LoginActivity.class)
                        );

                        finish();

                    } else {

                        Toast.makeText(
                                RegisterActivity.this,
                                "Registration Failed",
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                });
    }
}
