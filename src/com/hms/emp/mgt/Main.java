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


        //make db connection
        Employee emp=new Employee();
        emp.viewEmployeeDetail();

        System.out.println("Enter 1 for Insert new employee");
        System.out.println("Enter 2 for Update new employee");
        System.out.println("Enter 3 for Delete an employee");

        Scanner keyboard=new Scanner(System.in);
        int input=keyboard.nextInt();

        switch(input) {
            case 1 :
                emp.enterEmployeeDetail();
                break;

            case 2 :

                emp.editEmployeeDetail();
                break;

            case 3 :

                emp.removeEmployee();
                break;


            default :

        }

    }
}