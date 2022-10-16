package com.example.hotel.ui.login;



import android.os.Bundle;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hotel.R;
import com.example.hotel.ui.signup.signup;


public class login extends Fragment {



    private LoginViewModel mViewModel;
    private TextView newUser;


    public static login newInstance() {

        return new login();
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_login, container, false);

        newUser= v.findViewById(R.id.Creat);
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new signup();
                FragmentManager manager = getParentFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.commit();
            }


        });
        return v;

    }





}