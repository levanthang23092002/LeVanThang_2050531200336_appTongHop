package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import  android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button lognin, fb,gg;
    private EditText email;
    private EditText pass;
    private TextView addacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SignIn");
        setContentView(R.layout.activity_main);
        lognin = findViewById(R.id.btnlognin);
        email = findViewById(R.id.txtemail);
        pass = findViewById(R.id.txtpass);
        addacc=findViewById(R.id.btnadacc);
        fb=findViewById(R.id.btnfb);
        gg=findViewById(R.id.btngg);




            lognin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(email.getText().toString().equals("") || pass.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                    }
                    else
                    if (email.getText().toString().equals(appunti.name) && pass.getText().toString().equals(appunti.pass)) {
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                        openhome();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Tên Email hoặc password không tồn tại!!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            fb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openhome();
                }
            });

        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhome();
            }
        });

        addacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });
    }
    public void openprofile(){
        Intent intent = new Intent(this ,profile.class);
    startActivity(intent);
    }

    public void openhome(){
        Intent intent = new Intent(this ,home.class);
        startActivity(intent);
    }
    public void openSignup(){
        Intent intent = new Intent(this ,Signup.class);
        startActivity(intent);
    }

}