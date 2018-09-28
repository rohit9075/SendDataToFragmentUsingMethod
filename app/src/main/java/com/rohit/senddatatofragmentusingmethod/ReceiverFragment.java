package com.rohit.senddatatofragmentusingmethod;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReceiverFragment extends Fragment {

    private String email;


    public ReceiverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_receiver, container, false);

        final TextView mTextView = view.findViewById(R.id.received_email);
        Button mButton = view.findViewById(R.id.show_email);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(email);
            }
        });


        return view;
    }


    public void sendData(String email){
        this.email = email;
    }

}
