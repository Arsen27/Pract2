package com.company;

public class Student {
    protected String Name;
    protected String Surname;
    protected String Group;
    protected int Year;
    protected Result Results[];


    // Getters

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getGroup() {
        return Group;
    }

    public int getYear() {
        return Year;
    }

    public Result[] getResults() {
        return Results;
    }


    // Setters

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void Result(Result[] results) {
        Results = results;
    }


    int GetAveragePoints() {
        int sum = 0;
        for (int i = 0; i < Results.length; i++) {
            sum += Results[i].getPoints();
        }

        return sum / Results.length;
    }

    Result GetBestSubject(Result[] results) {
        Result max = results[0];
        for (int i = 0; i < results.length; i++) {
            if ( results[i].getPoints() > max.getPoints() ) {
                max = results[i];
            }
        }

        return max;
    }

    Result GetWorstSubject(Result[] results) {
        Result min = results[0];
        for (int i = 0; i < results.length; i++) {
            if ( results[i].getPoints() < min.getPoints() ) {
                min = results[i];
            }
        }

        return min;
    }


    Student() {

    }

    Student(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    Student(String name, String surname, String group, int year, Result results[]) {
        Name = name;
        Surname = surname;
        Group = group;
        Year = year;
        Results = results;
    }
}
