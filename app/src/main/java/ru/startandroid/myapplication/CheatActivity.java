package ru.startandroid.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        Intent i=getIntent();
        i.getBooleanExtra("Question_answer", true);
        i.getStringExtra("Question_text");
        TextView question=(TextView)findViewById(R.id.textView2);
        question.setText(i.getStringExtra("Question_text")); //TODO: Верстка
        Intent j=new Intent(CheatActivity.this, MainActivity.class);
        //TODO:Флаг чита 


    }
}
