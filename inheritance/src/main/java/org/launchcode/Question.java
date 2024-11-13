package org.launchcode;

public abstract class Question {

    private int pointValue;
    private String text;

    public Question(int pointValue, String text) {
    this.pointValue = pointValue;
    this.text = text;
}

    public void displayQuestion() {
        System.out.println(text);
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public abstract void displayAnswers ();

    public abstract int getAnswers();
}
