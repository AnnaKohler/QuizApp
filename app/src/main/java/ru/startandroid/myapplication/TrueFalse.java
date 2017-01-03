package ru.startandroid.myapplication;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Anna on 02.12.2016.
 */
public class TrueFalse {
    private boolean mTrueQuestion;
    private int mQuestion;

    public TrueFalse() {
    }

    @Override
    public String toString() {
        return "TrueFalse{" +
                "mTrueQuestion=" + mTrueQuestion +
                ", mQuestion=" + mQuestion +
                '}';
    }

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestionId(int questionId) {
        mQuestion = questionId;
    }

}
