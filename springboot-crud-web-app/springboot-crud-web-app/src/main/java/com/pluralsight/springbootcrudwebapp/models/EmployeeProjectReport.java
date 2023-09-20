package com.pluralsight.springbootcrudwebapp.models;

public class EmployeeProjectReport {
    private String firstName;
    private String lastName;
    private String title;

    public EmployeeProjectReport(String firstName,String lastName,String title){
        this.firstName=firstName;
        this.lastName=lastName;
        this.title=title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
