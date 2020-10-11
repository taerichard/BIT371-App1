package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.enter_button);
        TextView username = (TextView) findViewById(R.id.username);
        TextView pw = (TextView) findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
                String userName = username.getText().toString();
                String password = pw.getText().toString();
                intent.putExtra("username", userName);
                intent.putExtra("password", password);
                startActivity((intent));

            }
        });

    }
}


