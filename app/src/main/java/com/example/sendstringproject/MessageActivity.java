package com.example.sendstringproject;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.dispaly_message);
        textView.setText(message);
    }

    public void openFinalActivity(View view)
    {
        startActivity(new Intent (this,FinalActivity.class));

    }
}
