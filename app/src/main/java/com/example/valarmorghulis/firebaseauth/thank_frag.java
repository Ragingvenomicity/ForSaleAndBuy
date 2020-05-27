package com.example.valarmorghulis.firebaseauth;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class thank_frag extends Fragment {

    private Button home;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.thank_frag, container, false);

        home = (Button)v.findViewById(R.id.home_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeFragment homeFragment = new HomeFragment();
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction().replace(R.id.frag_container, homeFragment)
                        .addToBackStack(null).commit();
            }
        });

        return v;
    }
}
