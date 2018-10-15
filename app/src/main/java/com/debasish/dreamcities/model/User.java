package com.debasish.dreamcities.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

    String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }



    @Override
    public int isValidated() {
        if(TextUtils.isEmpty(getEmail()))
            return 1;
        else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return 2;
        else if (TextUtils.isEmpty(getPassword()))
            return 3;
        else if (getPassword().length() <= 6)
            return 4;
        else
            return -1;
    }
}
