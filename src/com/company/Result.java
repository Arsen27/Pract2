package com.company;

public class Result {
    protected String Subject;
    protected String Teacher;
    protected int Points;

    // Getters

    public String getSubject() {
        return Subject;
    }

    public String getTeacher() {
        return Teacher;
    }

    public int getPoints() {
        return Points;
    }


    // Setters

    public void setSubject(String subject) {
        Subject = subject;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public void setPoints(int points) {
        Points = points;
    }


    Result() {

    }

    Result(String subject, int points) {
        Subject = subject;
        Points = points;
    }

    Result(String subject, String teacher, int points) {
        Subject = subject;
        Teacher = teacher;
        Points = points;
    }
}
