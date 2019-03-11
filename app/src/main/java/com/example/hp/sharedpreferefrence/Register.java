package com.example.hp.sharedpreferefrence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText mobileno,email_name,password,conpassword;
    Button sumbit;

    PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mobileno=findViewById(R.id.Mobile);
        email_name=findViewById(R.id.Email_name);
        password=findViewById(R.id.Password);
        conpassword=findViewById(R.id.conPassword);

        sumbit=findViewById(R.id.submit);

        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String regi = mobileno.getText().toString();
                String email1 = email_name.getText().toString();
                String pass1 = password.getText().toString();
                String conpass1 = conpassword.getText().toString();

                if (!regi.equals("\"^[2-9]{2}[0-9]{8}$\","))
                    mobileno.setError("Enter Your number");

                if (!email1.isEmpty()) {
                    email_name.setError("Enter Email");
                }

                if (pass1.isEmpty()){
                    password.setError("Enter Password");
                }

                if (conpass1.isEmpty()){
                    conpassword.setError("Set Confirm Password");
                }


                preferenceManager = new PreferenceManager(getApplicationContext());
                preferenceManager.setRegisterSession(email1);

                preferenceManager.setKeyValueStringRegister("email_name",email1);
                preferenceManager.setKeyValueStringRegister("mobileno",regi);
                preferenceManager.setKeyValueStringRegister("password",pass1);
                preferenceManager.setKeyValueStringRegister("conpassword",conpass1);

                Intent register = new Intent(getApplicationContext(),Login.class);
                startActivity(register);
                finish();
                }
        });


    }
}
