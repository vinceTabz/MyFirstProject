package com.company.classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class User {
    String firstName;
    String lastName;
    String middleName;
    String email;
    String userName;
    String password;
    int age;

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setUserName(String userName) {
        this.userName = userName;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getMiddleName() {
        return middleName;
    }

    protected String getEmail() {
        return email;
    }

    protected String getUserName() {
        return userName;
    }

    protected String getPassword() {
        return password;
    }

    protected int getAge() {
        return age;

    }
}
