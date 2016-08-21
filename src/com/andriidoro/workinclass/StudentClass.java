package com.andriidoro.workinclass;

/**
 * Created by tafin on 15.08.2016.
 */
public class StudentClass extends PersonClass{
    private String university;
    private String faculty;

    public StudentClass(String name, String university, int age, String faculty){
        super(name,age);
        this.university = university;
        this.faculty = faculty;
    }

    public String getResponse(String question){
        return "Ehhh, what was the question?";
    }



}
