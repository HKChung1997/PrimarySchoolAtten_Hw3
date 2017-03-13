package com.example.chung.primaryschoolattenhw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button bLogin,bForget;
    EditText etUsername, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bForget = (Button) findViewById(R.id.bForget);

        bLogin.setOnClickListener(this);
        bForget.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogin:


                break;
            case R.id.bForget:
                startActivity(new Intent(this, ThirdFragment.class));
                break;
        }
    }
}
