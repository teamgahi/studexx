package com.example.nikkianne.hakatun;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Nikki Anne on 11/19/2016.
 */
public class fragmentprofile  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_pr, container, false);
        Button button = (Button) rootView.findViewById(R.id.submitB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence text = ("Thank you for posting your request. Your submission is awaiting admin approval. Please be patient. Stay Tuned!");
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(getActivity(), text, duration);
                toast.show();

            }
        });
        return rootView;
    }
}
