package ru.startandroid.myapplication;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Anna on 02.12.2016.
 */
public class TrueFalse {
    private boolean mTrueQuestion;
    private String mQuestion;

    public TrueFalse() {
    }

    @Override
    public String toString() {
        return "TrueFalse{" +
                "mTrueQuestion=" + mTrueQuestion +
                ", mQuestion=" + mQuestion +
                '}';
    }

    public TrueFalse(String question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestionId(String questionId) {
        mQuestion = questionId;
    }
    public boolean reaction(TextView t){ //TODO: Метод для проверки ответа
        return((this.isTrueQuestion()&& t.getText()=="Yes")||(!this.isTrueQuestion()&& t.getText()=="No"));
    }

}
