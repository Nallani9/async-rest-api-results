package com.nallani.model;

import java.util.ArrayList;

public class EmployeePhone {

    private ArrayList<String> phoneNumbers;

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "EmployeePhone{" +
                "phoneNumbers=" + phoneNumbers +
                '}';
    }
}
