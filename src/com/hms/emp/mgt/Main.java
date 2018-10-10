package com.hms.emp.mgt;
import java.util.Scanner;

public class Main {


//    Implement to a Java Console App to maintain company employee details. Following
// features should be available.

//        Enter Employee details
//        Edit Employee details
//        View employee details
//        Delete employee details



    public static void main(String[] args) {



        Employee emp=new Employee(); // create object
        Permanent pemp=new Permanent();// create object
        pemp.viewEmployeeDetail();//Encapsulation.
        System.out.println();


        System.out.println("Enter 1 for Insert new employee");
        System.out.println("Enter 2 for Insert permanent employee");
        System.out.println("Enter 3 for Update new employee");
        System.out.println("Enter 4 for Update permanent employee");
        System.out.println("Enter 5 for Delete an employee");



        Scanner keyboard=new Scanner(System.in);
        int input=keyboard.nextInt();

        switch(input) {

            case 1 ://Insert new employee
                emp.enterEmployeeDetail();
                break;

            case 2 ://Insert permanent employee
                pemp.enterEmployeeDetail(); //Polymorphism -method overriding
                break;

            case 3 ://Update new employee
                emp.editEmployeeDetail();
                break;

            case 4 ://permanent employee
                pemp.editEmployeeDetail();// inheritance
                break;

            case 5 ://Delete an employee
                pemp.removeEmployee();
                break;


            default :

        }

    }
}