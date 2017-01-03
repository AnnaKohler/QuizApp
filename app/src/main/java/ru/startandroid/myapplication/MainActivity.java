package ru.startandroid.myapplication;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private boolean isCheat=false;
    private TextView qsttext;
    private int currentIndex=0;

    private static String KEY_INDEX="index";
    public static String KEY_QA="Question_answer";
    public static String KEY_QT="Question_text";

    private TrueFalse arr[] = new TrueFalse[] {
            new TrueFalse(R.string.question_sapfo, true),
            new TrueFalse(R.string.question_alkej, false),
            new TrueFalse(R.string.question_bored, false),
            new TrueFalse(R.string.question_number4, true),
            new TrueFalse(R.string.question_end, false),
    };
    int pos=0;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(data==null){
            return;
        }
        isCheat=data.getBooleanExtra("IsCheater", false);
    }

    private void updateQuestion() {
        int question =arr[currentIndex].getQuestion();
        qsttext.setText(question);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView qsttext=(TextView)findViewById(R.id.qst);

        TextView btnYes=(TextView) findViewById(R.id.btnYes);
        TextView btnNo =(TextView) findViewById(R.id.btnNo);
        TextView btnNext =(TextView) findViewById(R.id.btnNext);
        Button btnCheat=(Button)findViewById(R.id.btnCht);


        btnYes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                findViewById(R.id.txtWrong).setVisibility(View.GONE);
                findViewById(R.id.txtRight).setVisibility(View.GONE);

              if(arr[currentIndex].isTrueQuestion()) {
                  findViewById(R.id.txtRight).setVisibility(View.VISIBLE);
                  if(isCheat){
                      Toast t =Toast.makeText(getApplicationContext(), "Cheating isn't allowed", Toast.LENGTH_LONG);
                      t.show();
                  }
                  isCheat=false;
                  currentIndex = (currentIndex + 1) % arr.length;
                  updateQuestion();
              }
                else findViewById(R.id.txtWrong).setVisibility(View.VISIBLE);
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.txtWrong).setVisibility(View.GONE);
                findViewById(R.id.txtRight).setVisibility(View.GONE);
                if(!arr[currentIndex].isTrueQuestion()) {
                    findViewById(R.id.txtRight).setVisibility(View.VISIBLE);
                    if(isCheat){
                        Toast t =Toast.makeText(getApplicationContext(), "Cheating isn't allowed", Toast.LENGTH_LONG);
                        t.show();
                    }
                    isCheat=false;
                    currentIndex = (currentIndex + 1) % arr.length;
                    updateQuestion();
                }
                else findViewById(R.id.txtWrong).setVisibility(View.VISIBLE);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                currentIndex = (currentIndex + 1) % arr.length;
                updateQuestion();
                }
        });
        btnCheat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, CheatActivity.class);
                i.putExtra(KEY_QT, arr[currentIndex].getQuestion());
                i.putExtra(KEY_QA, arr[currentIndex].isTrueQuestion());
                startActivity(i);

                //onActivityResult(int requestCode, int resultCode, Intent data); TODO: onActivityresult

            }
        });


    }

}
