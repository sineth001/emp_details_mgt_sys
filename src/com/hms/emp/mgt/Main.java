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
        // write your code here

        DBConnect connect = new DBConnect();
        connect.viewEmployee();

        System.out.println("Enter 1 for Insert new employee");
        System.out.println("Enter 2 for Insert new employee");
        System.out.println("Enter 3 for Insert new employee");

        Scanner keyboard=new Scanner(System.in);
//        System.out.println("Employee  name");
        int input=keyboard.nextInt();

        switch(input) {
            case 1 :
                connect.enterEmployee();
                break;

            case 2 :
                System.out.println("Enter employee id that you need to edit");
                int emp_id=keyboard.nextInt();
                connect.editEmployee(1);
                break;

            case 3 :
                System.out.println("Enter employee id that you need to delete");
                int id=keyboard.nextInt();
                connect.deleteEmployee(1);
                break;


            default :

        }

    }
}