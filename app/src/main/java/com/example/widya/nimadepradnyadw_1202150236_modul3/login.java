package com.example.widya.nimadepradnyadw_1202150236_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText uname, pass;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.pass);
        btLogin = (Button) findViewById(R.id.btLogin);
        //jika button login diklick
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unameKey = uname.getText().toString();
                String passKey = pass.getText().toString();
                //jika username dan password benar
                if (unameKey.equals("EAD")&&passKey.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(), "Login Sukses...!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    //jika username dan password salah
                    Toast.makeText(getApplicationContext(), "Username atau Password salah...!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
