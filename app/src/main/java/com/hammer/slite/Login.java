package com.hammer.slite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
EditText username,pass;
Button b2;
String u,p;
Login lg=new Login();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.pass);
        b2=(Button)findViewById(R.id.b2);




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home h=new Home(Login.this);
                if( h.vaildate(username.getText().toString().trim(),pass.getText().toString().trim())){


                }
            }
        });

    }
}
