package com.if4a.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView tvSesi, tvName;
    private MaterialButton btnLogout;
    KendaliLogin KL = new KendaliLogin();
    public static String keySPusername = "GtPJAx45LMjkuICbExYElQ==_username";
    public static String keySPname = "GtPJAx45LMjkuICbExYElQ==_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(KL.isLogin(MainActivity.this, keySPusername) == true){
            setContentView(R.layout.activity_main);

            tvSesi = findViewById(R.id.tv_sesi);
            tvName = findViewById(R.id.tv_name);
            btnLogout = findViewById(R.id.btn_logout);

            tvSesi.setText(KL.getPref(MainActivity.this, keySPusername));
            tvName.setText(KL.getPref(MainActivity.this, keySPname));

            btnLogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    KL.setPref(MainActivity.this, keySPusername, null);
                    KL.setPref(MainActivity.this, keySPname, null);
                    startActivity(new Intent(MainActivity.this, Login_Activity.class));
                    finish();
                }
            });
        }
        else{
            startActivity(new Intent(MainActivity.this, Login_Activity.class));
            finish();
        }
    }
}