package com.arhamapps.investapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginFragment extends Fragment implements View.OnClickListener {
    EditText usernameLogin, passwordLogin;
    Button signin;
    TextView signupLogin;
    private ViewPager viewPager;

    public LoginFragment(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        usernameLogin = (EditText) view.findViewById(R.id.username_login);
        passwordLogin = (EditText) view.findViewById(R.id.password_login);
        signin = (Button) view.findViewById(R.id.signin_button);
        signupLogin = (TextView) view.findViewById(R.id.signup_login);

        signin.setOnClickListener(this);
        signupLogin.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id;
        id = v.getId();
        switch (id) {
            case R.id.signin_button:
                Intent signin = new Intent(getContext(), WelcomeActivity.class);
                startActivity(signin);
                break;
            case R.id.signup_login:
                viewPager.setCurrentItem(1);
                break;
        }
    }
}