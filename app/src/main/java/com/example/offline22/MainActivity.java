package com.example.offline22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String sc;
    public String scc;
    private Button scoreButtonn;
    private Button exitButton;
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = (Button)findViewById(R.id.exitButton);
        scoreButtonn = (Button)findViewById(R.id.scoreButton);

         Bundle bundle = getIntent().getExtras();
         if(bundle!=null)
         {
             sc = bundle.getString("tagg");

             scc = bundle.getString("taggg");
         }
         else
         {
           sc = " 0 ";
           scc = " ----";
         }


        scoreButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            Intent scoreintent =  new Intent(MainActivity.this,Score.class);
            scoreintent.putExtra("tagg",sc);
            scoreintent.putExtra("taggg",scc);
            startActivity(scoreintent);

            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });

        startButton = (Button)findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,GamePage.class);
                startActivity(intent);
            }
        });
    }
}
