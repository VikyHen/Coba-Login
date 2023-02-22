package com.if4a.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class Login_Activity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private MaterialButton btnLogin;
    private String username, password;
    KendaliLogin KL = new KendaliLogin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
    }



}