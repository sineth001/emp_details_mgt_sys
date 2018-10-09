package com.hms.emp.mgt;

import java.util.Scanner;

public class Permanent extends Employee{

  /**
     * Get user input to add new employee
     */
    public void  enterEmployeeDetail() { //Polymorphism method over loading

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Employee  name");
        String name = keyboard.nextLine();
        System.out.println("Position of employee");
        String position = keyboard.nextLine();
        System.out.println("Date of birth (yyyy-mm-dd)");
        String birthDay = keyboard.nextLine();
        System.out.println("Employee contact");
        String contact = keyboard.nextLine();

        System.out.println("------------------------");
        System.out.println("Employee detail that you entered are followings.");

        System.out.println("Name :" + name);
        System.out.println("Position : " + position);
        System.out.println("Date of birth : " + birthDay);
        System.out.println("Contact : " + contact);
        System.out.println("Permanent : yes " );


        String permanent= "yes";

        DBConnect connect = new DBConnect();
        connect.insertEmployee(name,position,birthDay,contact,permanent);

    }

    /**
     * get user input to update employee
     * Edit employee by id
     */
//    public void  editPermanentEmployeeDetail() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter employee id that you need to edit");
//        int id=input.nextInt();
//
//        System.out.println("Edit employee detail detail for id = " + id);
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Employee  name");
//        String name = keyboard.nextLine();
//        System.out.println("Position of employee");
//        String position = keyboard.nextLine();
//        System.out.println("Date of birth (yyyy-mm-dd)");
//        String birthDay = keyboard.nextLine();
//        System.out.println("Employee contact");
//        String contact = keyboard.nextLine();
//
//        System.out.println("------------------------");
//        System.out.println("Employee detail that you updated are followings.");
//
//        System.out.println("Name :" + name);
//        System.out.println("Position : " + position);
//        System.out.println("Date of birth : " + birthDay);
//        System.out.println("Contact : " + contact);
//
//        DBConnect connect = new DBConnect();
//        connect.updateEmployee(name,position,birthDay,contact,id);
//
//    }


}
