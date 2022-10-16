package com.example.hotel.ui.signup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.hotel.R;
import com.example.hotel.ui.login.login;

public class signup extends Fragment {

    private SignupViewModel mViewModel;
    private TextView User;

    public static signup newInstance() {

        return new signup();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_signup, container, false);

        User= v.findViewById(R.id.idSignin);
        User.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment fragment = new login();
            FragmentManager manager = getParentFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.nav_host_fragment_content_main, fragment);
            transaction.commit();}
        });
    return v;
    }
}