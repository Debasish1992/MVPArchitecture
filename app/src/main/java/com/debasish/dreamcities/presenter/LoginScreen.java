package com.debasish.dreamcities.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.debasish.dreamcities.R;
import com.debasish.dreamcities.view.ILoginView;

public class LoginScreen extends AppCompatActivity implements ILoginView {


    EditText etUserId;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginValidation(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
