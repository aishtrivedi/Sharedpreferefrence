package com.example.hp.sharedpreferefrence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tv1=findViewById(R.id.Text);
        tv2=findViewById(R.id.Text1);
        tv3=findViewById(R.id.Text2);
        tv4=findViewById(R.id.Text3);

        preferenceManager = new PreferenceManager(getApplicationContext());

        String regi= preferenceManager.getKeyValueStringRegister("mobileno");
        tv1.setText(regi);

        String email = preferenceManager.getKeyValueStringRegister("email_name");
        tv2.setText(email);

        String pass = preferenceManager.getKeyValueStringRegister("password");
        tv3.setText(pass);

        String conpass1 = preferenceManager.getKeyValueStringRegister("conpassword");
        tv4.setText(conpass1);



//        String pass = preferenceManager.getKeyValueString("password");
//        tv3.setText(pass);





    }
}
