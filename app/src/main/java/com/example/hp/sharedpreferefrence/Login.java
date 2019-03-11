package com.example.hp.sharedpreferefrence;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.PrivateKey;

public class Login extends AppCompatActivity {

    Button login1,newaccount;
    EditText num,pass1;
    PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        num = (EditText) findViewById(R.id.Number);
        pass1 = (EditText) findViewById(R.id.pass);
        login1 = (Button) findViewById(R.id.login);
        newaccount = (Button) findViewById(R.id.NewAccount);


        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pass = pass1.getText().toString();
                String num1 = num.getText().toString();

                if (!num1.isEmpty()) {
                    num.setError("Enter Email");
                }

                if (!pass.equals("123")) {
                    pass1.setError(" password not matched");
                    return;
                }


                preferenceManager = new PreferenceManager(getApplicationContext());
                preferenceManager.setLoginSession(num1);
                preferenceManager.setKeyValueString("num1", num1);
                //Log.e("loginSession", "loginUser:"+preferenceManager.getLoginSession() );

                Intent xyz = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(xyz);


            }
        });

        newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);
            }
        });


    }


}
