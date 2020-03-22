package com.example.offline22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GamePage extends AppCompatActivity {


    private int count=0;
    private TextView TV;
    private EditText editText;
    private Button goButton;
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);


        final String[] myString = new String[15];
        myString[1] = "BIR_S";
        myString[2] = "POO_";
        myString[3] = "MA_H";
        myString[4] = "THAN_S";
        myString[5] = "BEA_TY";
        myString[6] = "CAS_LE";
        myString[7] = "LI_N";
        myString[8] = "T_NT";
        myString[9] = "TI_ER";
        myString[10] = "CH_NGE";


        final String[] result = new String[15];
        result[1] = "D";
        result[2] = "L";
        result[3] = "T";
        result[4] = "K";
        result[5] = "U";
        result[6] = "T";
        result[7] = "O";
        result[8] = "E";
        result[9] = "G";
        result[10] = "A";

        TV = (TextView)findViewById(R.id.String);
        goButton = (Button)findViewById(R.id.goButton);
        editText = (EditText)findViewById(R.id.editTeext);



        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            String str = editText.getText().toString();



            if(str.contentEquals(result[i]))
            {
                Toast.makeText(GamePage.this,"Correct",Toast.LENGTH_SHORT).show();
                count++;
            }
            else
            {
                Toast.makeText(GamePage.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
            }

            TV.setText(myString[i+1]);
            editText.setText("");


            i++;
                if(i==11)
                {
                    count = count*100;
                    Intent logoutintent = new Intent(GamePage.this,YourScore.class);
                    logoutintent.putExtra("tag",count);
                    startActivity(logoutintent);


                }


            }
        });



    }
}
