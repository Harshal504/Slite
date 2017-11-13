package com.hammer.slite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,email,phone,password;
Button b1;
Home h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);
        password=(EditText)findViewById(R.id.password);
        b1=(Button)findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                Regmodel rm=new Regmodel();
                h=new Home(MainActivity.this);
                rm.setName(name.getText().toString().trim());
                rm.setEmail(email.getText().toString().trim());
                rm.setPhone(phone.getText().toString().trim());
                rm.setPassword(password.getText().toString().trim());
                h.insertdata(rm);
                Intent i=new Intent(getApplicationContext(),Dashboard.class);
                startActivity(i);

            }
        });














    }
}
