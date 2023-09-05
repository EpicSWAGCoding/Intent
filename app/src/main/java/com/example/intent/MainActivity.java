package com.example.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton1 = findViewById(R.id.button);
        TextView mTextView = findViewById(R.id.textView);
        mTextView.setText((String)getIntent().getSerializableExtra("message"));
        mButton1.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
            startActivity(intent);
        }
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }
}