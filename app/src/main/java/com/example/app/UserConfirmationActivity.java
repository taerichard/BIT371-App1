package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;



public class UserConfirmationActivity extends AppCompatActivity {
    public String Username = "richard";
    public String Password = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView wm = (TextView) findViewById(R.id.textView2);

        String username;
        String pw;

        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        pw = intent.getStringExtra("password");

        if(this.Password.matches(pw)){
            wm.setText("Welcome to Andorid");
        }
        else{
            wm.setText(("Username/Password combination is wrong"));
        }

    }

    private boolean userAuthorized(String password){
        if(password == this.Password)
            return true;
        return false;
    }

}
