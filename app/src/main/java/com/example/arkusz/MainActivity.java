package com.example.arkusz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailInput = findViewById(R.id.emailInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        EditText repeatedPasswordInput = findViewById(R.id.passwordRepeatInput);
        Button confirmBtn = findViewById(R.id.confirmBtn);
        TextView resultLabel = findViewById(R.id.resultLabel);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                if (email.contains("@")) {
                    String password = passwordInput.getText().toString();
                    String repeatedPassword = repeatedPasswordInput.getText().toString();
                    if (password.equals(repeatedPassword) && !password.equals("")) {
                        resultLabel.setText("Witaj " + email);
                    } else {
                        resultLabel.setText("Haslo nie zgadzaja sie");
                    }
                } else {
                    resultLabel.setText("Email nie poprawny");
                }
            }
        };
        confirmBtn.setOnClickListener(onClickListener);
    }
}