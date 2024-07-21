package com.java_project.people;

public class Actors {
    private String name;
    private String sex;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    
    public Actors(String name, String sex, int yearBirth, int monthBirth, int dayBirth) {
        this.name = name;
        this.sex = sex;
        this.birthYear = yearBirth;
        this.birthMonth = monthBirth;
        this.birthDay = dayBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return sex;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthYear(int yearBirth) {
        this.birthYear = yearBirth;
    }
    
    public void setBirthMonth(int monthBirth) {
        this.birthMonth = monthBirth;
    }

    public void setBirthDay(int dayBirth) {
        this.birthDay = dayBirth;
    }


    // this method return the actor's age
    public int age(int currentYear, int currentMonth, int currentDay) {
        // Checking if the actor's date of birth has passed, to return a more accurate age
        if (currentMonth < this.birthMonth) {
            return currentYear - this.birthYear - 1;
        }
        if (currentDay < this.birthDay) {
            return currentYear - this.birthYear - 1;
        }
        return currentYear - this.birthYear;
    }
}
