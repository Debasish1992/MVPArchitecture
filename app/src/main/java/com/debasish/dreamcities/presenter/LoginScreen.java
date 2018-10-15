package com.debasish.dreamcities.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.debasish.dreamcities.R;
import com.debasish.dreamcities.view.ILoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginScreen extends AppCompatActivity implements ILoginView {


    @BindView(R.id.etUserName)
    EditText etUserId;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    LoginPresenter loginPresenter;

    // Click Event of the login button
    @OnClick(R.id.btnLogin) void login(){
        String userName = etUserId.getText().toString().trim();
        String password =  etPassword.getText().toString().trim();
        loginPresenter.onLogin(userName, password);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ButterKnife.bind(this);

        getSupportActionBar().hide();

        loginPresenter = new LoginPresenter(this);
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
