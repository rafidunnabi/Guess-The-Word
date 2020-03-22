package com.example.offline22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {


    public String sc;
    public String scc;
    public String nal;
    private TextView nameescore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        nameescore = (TextView)findViewById(R.id.namescore);

        Bundle bundlee = getIntent().getExtras();
        if(bundlee!=null)
        {
             sc = bundlee.getString("tagg");
             scc = bundlee.getString("taggg");
            nameescore.setText(scc + "               " + sc);
        }
        else
        {
            nameescore.setText(" 0              ");
        }






    }
}
