package com.suriya.unscript;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PostLogin extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_login);
    }

    @Override
    public void onClick(View v) {
        Intent intentOne=new Intent();
        intentOne.setClass(this,MainActivity.class);
        startActivity(intentOne);
    }
}

