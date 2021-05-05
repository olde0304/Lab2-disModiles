package com.example.lab2_olde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MessageActitivity.class);
        EditText editText = findViewById(R.id.test_message);
        intent.putExtra("Message", editText.getText().toString());
        startActivity(intent);
    }
}