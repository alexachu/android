package com.example.sjcet.logreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    String usernameValue, passwordValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Intent intent = new Intent(MainActivity.this,
                Main2Activity.class);
        startActivity(intent);
    }
    public void cclick(View view) {
            username = findViewById(R.id.et1);
            password = findViewById(R.id.et2);
            login = findViewById(R.id.bt1);


            usernameValue = username.getText().toString();
            passwordValue = password.getText().toString();
                if (usernameValue.equals("admin") && passwordValue.equals("admin")) {
                    Intent i = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(i);
                    this.finish();
                } else {
                    Toast t = Toast.makeText(this, "error", Toast.LENGTH_SHORT);
                    t.show();
                }
            }



    }

