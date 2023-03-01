package com.if4a.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                if(username.trim().equals(null)){
                    etUsername.setError("Username tidak boleh kosong");
                }
                else if (password.trim().equals(null)){
                    etPassword.setError("Password tidak boleh kosong");
                }
                else{
                    if(username.equals("vikyhendriko") && password.equals("kamunanyae?")){
                        KL.setPref(Login_Activity.this, MainActivity.keySPusername, username);
                        KL.setPref(Login_Activity.this, MainActivity.keySPname, "Viky Hendriko");
                        startActivity(new Intent(Login_Activity.this, MainActivity.class));
                        finish();
                    }
                    if(username.equals("rickykaka") && password.equals("terserah")){
                        KL.setPref(Login_Activity.this, MainActivity.keySPusername, username);
                        KL.setPref(Login_Activity.this, MainActivity.keySPname, "Ricardo Kaka");
                        startActivity(new Intent(Login_Activity.this, MainActivity.class));
                        finish();
                    }
                    else{
                        Toast.makeText(Login_Activity.this, "Username atau Password Belum Tepat", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

}