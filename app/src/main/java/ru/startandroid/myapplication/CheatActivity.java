package ru.startandroid.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheatActivity extends AppCompatActivity {
    boolean isCheat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        Intent i=getIntent();
        i.getBooleanExtra("Question_answer", true);
        i.getStringExtra("Question_text");

        final boolean ans = i.getBooleanExtra("Question_answer", true); //строка со значением ответа

        final TextView question=(TextView)findViewById(R.id.textQstText);
        question.setText(i.getStringExtra("Question_text"));

        final Intent j=new Intent (CheatActivity.this, MainActivity.class);

        Button btnCht=(Button)findViewById(R.id.btnCheat);

        btnCht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "The answer is: " + (ans?"True":"False"), Toast.LENGTH_SHORT );
                t.show();
                j.putExtra("isCheater", true);
                startActivityForResult(j, 0);
            }
        });


        //TODO:Флаг чита 


    }
}
