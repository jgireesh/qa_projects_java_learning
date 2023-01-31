package org.learning.controlstatements;

public class IfElseIf {
    public static void main(String[] args) {
        int score = 76;
        char grade;

        if(score >= 90){
            grade='A';
        }
        else if (score >=75 && score <90){
            grade='B';
        }
        else if (score <75 && score>50){
            grade='C';
        }
        else {
            grade='F';
        }

        System.out.println("Grade : "+grade);
    }
}
