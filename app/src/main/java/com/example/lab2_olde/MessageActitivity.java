package com.example.lab2_olde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_2);

        Intent inten = getIntent();
        String message = inten.getStringExtra("Message");
        TextView messageTextView = findViewById(R.id.textView);
        messageTextView.setText(message);
    }
}