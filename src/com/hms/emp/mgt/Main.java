package com.hms.emp.mgt;

public class Main {


//    Implement to a Java Console App to maintain company employee details. Following
// features should be available.

//        Enter Employee details
//        Edit Employee details
//        View employee details
//        Delete employee details



    public static void main(String[] args) {
        // write your code here

        DBConnect connect =new DBConnect();

//        connect.viewEmployee();
        connect.enterEmployee();


    }
}