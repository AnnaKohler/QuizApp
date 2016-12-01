package ru.startandroid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean ans=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.btn1);
        btn1.setText("Да");
        Button btn2 =(Button)findViewById(R.id.btn2);
        btn2.setText("Нет");
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.txtWrong).setVisibility(View.GONE);
                findViewById(R.id.txtRight).setVisibility(View.GONE);

              if(ans)findViewById(R.id.txtRight).setVisibility(View.VISIBLE);
                else findViewById(R.id.txtWrong).setVisibility(View.VISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.txtWrong).setVisibility(View.GONE);
                findViewById(R.id.txtRight).setVisibility(View.GONE);
                if(!ans)findViewById(R.id.txtRight).setVisibility(View.VISIBLE);
                else findViewById(R.id.txtWrong).setVisibility(View.VISIBLE);
            }
        });
    }

}
