package com.example.professor.aula4;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocarTela(View v)
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
