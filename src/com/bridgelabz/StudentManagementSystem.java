package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem implements IAStudent {

    ArrayList<Contacts> personDetails = new ArrayList<Contacts>();
    Contacts contacts = new Contacts(null, null, null, 0, 0);
    Scanner sc = new Scanner(System.in);

    /*
     * This method is used to add details to address book
     */
    @Override
    public void addDetails() {

        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the last name");
        String lastName = sc.next();
        System.out.println("Enter the Subject");
        String subject = sc.next();
        System.out.println("Enter the Employee ID");
        int empID = sc.nextInt();
        System.out.println("Enter the phone number");
        long phoneNumber = sc.nextLong();

        contacts = new Contacts(firstName, lastName, subject, empID, phoneNumber);
        personDetails.add(contacts);

    }

    /*
     * This method is used to display the added information
     */
    @Override
    public void display() {
        System.out.println(personDetails);
    }

    @Override
    public void search() {
        System.out.println("Confirm your first name to search contact: ");
        String confirmName = sc.next();

        for (int i = 0; i < personDetails.size(); i++) {

            if (personDetails.get(i).getFirstName().equals(confirmName)) {
                System.out.println("Contact Found ");
                System.out.println(personDetails.get(i));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
