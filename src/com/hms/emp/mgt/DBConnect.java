package com.hms.emp.mgt;


//import java.util.Calendar;

import java.util.Scanner;

import java.sql.*;

public class DBConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;


    public DBConnect() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_mgt_sys", "user", "password");
            st = con.createStatement();

        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }
    }

    public void selectEmployee() {



        try {

            String query = "select * from employee";
            rs = st.executeQuery(query);
            System.out.println("Recoards from database");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                String birth_date = rs.getString("birth_day");
                String contact = rs.getString("contact_number");


                System.out.println("id :" + id + " name: " + name + "  position: " + position + " Birth day : " + birth_date + " contact number " + contact);
            }

        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

    public void insertEmployee( String name,String position,String birthDay,String contact ) {

        try {

            String query = "insert into employee(name,position,birth_day,contact_number) " +
                    "values ( ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, name);
            preparedStmt.setString(2, position);
            preparedStmt.setString(3, birthDay);
            preparedStmt.setString(4, contact);

            preparedStmt.execute();


        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

    public void updateEmployee( String name,String position,String birthDay,String contact, int empId) {

        try {

            String query = "update employee set name = ?, position= ?,birth_day=?, contact_number=? where id=" + empId;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, name);
            preparedStmt.setString(2, position);
            preparedStmt.setString(3, birthDay);
            preparedStmt.setString(4, contact);

            preparedStmt.executeUpdate();


        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

    public void deleteEmployee(int empId) {

        try {

            String query = "delete from employee where id = " + empId;
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();

            System.out.println("employee id : " + empId + "  deleted");


        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

}
