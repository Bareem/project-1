package com.example.codept.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    private static Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btnsubmit);
        openLogin();
        btn2=(Button)findViewById(R.id.btnreg);
        openRegister();
    }

    public void openRegister() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent("com.example.codept.auth.Registration");
                startActivity(intent1);
            }
        });
    }


    public void openLogin()
    {

        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent2=new Intent("com.example.codept.auth.login");
               startActivity(intent2);
           }
       });
    }
}
