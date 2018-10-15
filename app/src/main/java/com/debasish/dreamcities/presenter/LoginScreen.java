package com.debasish.dreamcities.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.debasish.dreamcities.R;

public class LoginScreen extends AppCompatActivity {


    EditText etUserId;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }
}
