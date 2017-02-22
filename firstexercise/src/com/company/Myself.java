package com.company;

import com.company.classes.User;

/**
 * Created by jpmc on 2/18/2017.
 */
public class Myself extends User{

    public String firstName;
    public String lastName;


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Myself(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    /*    public String intruduceMyself(String firstName, String lastName, String middleName) {
        return "Hello I'm " + firstName + " " + lastName + " "+middleName;*/
    }

       }
