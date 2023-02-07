package com.bridgelabz;

public class Contacts {

    private String firstName, lastName, subject;
    private int empID;
    private long phoneNumber;

    public Contacts(String firstName, String lastName, String subject, int empID, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.empID = empID;
        this.phoneNumber = phoneNumber;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                ", empID=" + empID +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}