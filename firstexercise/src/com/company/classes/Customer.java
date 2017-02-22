package com.company.classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class Customer extends User {

    public String intruduceMyself(String firstName, String lastName, String middleName, int age) {
        return "Costumer: " + firstName + " " + lastName + " " + middleName + " " + age;
    }
    public String intruduceMyself(String maritalStatus, String gender, int hieght, int wieght) {
        return "Other Info: " + maritalStatus + " " + gender + " "+hieght+" " +wieght;



/*
    String address;
    String telephoneNumber;
    String costumerId;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setCostumerId(String costumerId) {
        this.costumerId = costumerId;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getCostumerId() {
        return costumerId;*/
    }
}
