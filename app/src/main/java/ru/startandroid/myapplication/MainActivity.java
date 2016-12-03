package ru.startandroid.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    boolean ans=true;

    TrueFalse arr[]=new TrueFalse[]{
            new TrueFalse("Сапфо писала на эолийском диалекте", true ),
            new TrueFalse("Алкей писал ямбом", false ),
            new TrueFalse("Мне уже скучно писать вопросы", false ),
            new TrueFalse("Следующий вопрос - номер 4", true ),
            new TrueFalse("Это еще не конец", false ),
    };
    int pos=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int score=0;

        TextView btn1=(TextView) findViewById(R.id.btn1);
        TextView btn2 =(TextView) findViewById(R.id.btn2);
        TextView btn3 =(TextView) findViewById(R.id.btn3);
        final TextView qsttext=(TextView) findViewById(R.id.qst);
        qsttext.setText(arr[pos].getQuestion());


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.txtWrong).setVisibility(View.GONE);
                findViewById(R.id.txtRight).setVisibility(View.GONE);

              if(arr[pos].isTrueQuestion()) {
                  findViewById(R.id.txtRight).setVisibility(View.VISIBLE);
                  if(pos<arr.length-1) pos++;
                  else pos=0;
                  qsttext.setText(arr[pos].getQuestion());
              }
                else findViewById(R.id.txtWrong).setVisibility(View.VISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.txtWrong).setVisibility(View.GONE);
                findViewById(R.id.txtRight).setVisibility(View.GONE);
                if(!arr[pos].isTrueQuestion()) {
                    findViewById(R.id.txtRight).setVisibility(View.VISIBLE);
                    if(pos<arr.length-1) pos++;
                    else pos=0;
                    qsttext.setText(arr[pos].getQuestion());
                }
                else findViewById(R.id.txtWrong).setVisibility(View.VISIBLE);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    if(pos<arr.length-1) pos++;
                    else pos=0;
                    qsttext.setText(arr[pos].getQuestion());
                }
        });
    }

}
