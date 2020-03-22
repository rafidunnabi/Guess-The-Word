package com.example.offline22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class YourScore extends AppCompatActivity {

    private EditText name;
    private Button saveButton;
    private TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_score);

        score = (TextView) findViewById(R.id.score);
        saveButton = (Button)findViewById(R.id.saveButton);
        name = (EditText)findViewById(R.id.EnterYourName);

        Bundle bundle = getIntent().getExtras();

        int value = bundle.getInt("tag");

        String sco = Integer.toString(value);
        score.setText(sco);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menuintent = new Intent(YourScore.this,MainActivity.class);

                String scoo = score.getText().toString();
                menuintent.putExtra("tagg",scoo);
                String namee = name.getText().toString();
                menuintent.putExtra("taggg",namee);
                startActivity(menuintent);
            }
        });
    }
}
