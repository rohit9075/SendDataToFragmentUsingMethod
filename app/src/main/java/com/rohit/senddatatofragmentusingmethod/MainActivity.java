package com.rohit.senddatatofragmentusingmethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEmailEditText;
    Button mSendDataButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailEditText = findViewById(R.id.email);
        mSendDataButton = findViewById(R.id.button_send_data);

        mSendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getEamil = mEmailEditText.getText().toString();

                ReceiverFragment fragment = new ReceiverFragment();

                fragment.sendData(getEamil);

                getSupportFragmentManager().beginTransaction().add(R.id.container, fragment,"ReceiverFragment").commit();


            }
        });
    }
}
