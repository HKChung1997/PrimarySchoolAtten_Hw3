package com.example.chung.primaryschoolattenhw.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.chung.primaryschoolattenhw.Fragment.ForgetPwFragment;
import com.example.chung.primaryschoolattenhw.R;

/**
 * Created by Chung on 2/3/2017.
 */
public class LoginFragment extends Fragment{
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.activity_login, container, false);

        Button btnForgot = (Button) myView.findViewById(R.id.bForget);
        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start new fragment and replace current fragment
                ForgetPwFragment nextFrag= new ForgetPwFragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag,"FRAGMENT_FORGOT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return myView;

    }

}
