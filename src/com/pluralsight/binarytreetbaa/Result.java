package com.pluralsight.binarytreetbaa;
//Result object for the double linked list
public class Result {

    private String subject;
    private int grade;
    private double avg;

    public Result() {
    }

    public Result(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }



    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }
}
