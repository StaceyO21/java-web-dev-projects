package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question{

    private boolean correctAnswer;

    public TrueFalse(int pointValue, String text, boolean correctAnswer) {
        super(pointValue, text);
        setPointValue(1);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer (boolean possibleAnswer) {
        if(possibleAnswer == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What is your answer? Type 't' for True and 'f' for False");
        String userAnswer = answer.nextLine();
        if(userAnswer.indexOf('t') >= 0) {
            if (isCorrectAnswer(true)) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            if (isCorrectAnswer(false)) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
