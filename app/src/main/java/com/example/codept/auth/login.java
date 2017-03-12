package com.example.codept.auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText uname;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login()
    {
        uname=(EditText)findViewById(R.id.email);
        pass=(EditText)findViewById(R.id.pass);
            new View.OnClickListener(){
                  public void onClick(View v)
                  {
                      if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                      {
                          Toast.makeText(login.this,"correct",Toast.LENGTH_SHORT).show();

                      }
                      else
                      {
                          Toast.makeText(login.this,"incorrect",Toast.LENGTH_SHORT).show();
                      }
                  }
            };

    }
}
