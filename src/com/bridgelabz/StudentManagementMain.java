package com.bridgelabz;

import java.util.Scanner;

public class StudentManagementMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Student Management system ");
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem details = new StudentManagementSystem();

        int choice = 1;

        while (choice == 1) {
            System.out.println("Choose One of the Given Choices as per Requirement: ");
            System.out.println("1. Add Details. \n2. Search Contact. \n3. Display Details. \n0. Exit.");

            switch (sc.nextInt()) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.search();
                    break;
                case 3:
                    details.display();
                    break;
                default:
                    choice = 0;
            }
        }
    }
}