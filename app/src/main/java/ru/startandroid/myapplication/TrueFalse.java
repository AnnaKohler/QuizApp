package ru.startandroid.myapplication;

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
    public static void reaction(TrueFalse t){ //TODO: Метод для проверки ответа

    }

}
