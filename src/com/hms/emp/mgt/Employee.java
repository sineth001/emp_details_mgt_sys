package com.hms.emp.mgt;

import java.util.Scanner;

public class Employee {

//        Enter Employee details
//        Edit Employee details
//        View employee details
//        Delete employee details



    public void  viewEmployeeDetail() {
        DBConnect connect = new DBConnect();
        connect.selectEmployee();


    }


    public void  enterEmployeeDetail() {

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

        DBConnect connect = new DBConnect();
        connect.insertEmployee(name,position,birthDay,contact);



    }
    public void  editEmployeeDetail() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee id that you need to edit");
        int id=input.nextInt();

        System.out.println("Edit employee detail detail for id = " + id);

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
        System.out.println("Employee detail that you updated are followings.");

        System.out.println("Name :" + name);
        System.out.println("Position : " + position);
        System.out.println("Date of birth : " + birthDay);
        System.out.println("Contact : " + contact);

        DBConnect connect = new DBConnect();
        connect.updateEmployee(name,position,birthDay,contact,id);

    }

    public void  removeEmployee() {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter employee id that you need to delete");
        int id=keyboard.nextInt();

        DBConnect connect = new DBConnect();
        connect.deleteEmployee(id);

    }
}
