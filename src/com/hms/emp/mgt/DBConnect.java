package com.hms.emp.mgt;


//import java.util.Calendar;

import java.util.Scanner;

import java.sql.*;

public class DBConnect {

    private Connection con; //abstraction
    private Statement st;
    private ResultSet rs;


    /**
     * make DB connection with mysql in the constructor of the DBConnect
     */
    public DBConnect() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_mgt_sys", "user", "password");
            st = con.createStatement();

        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }
    }

    /**
     * execute insert query to get all of employee table
     */
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
                String permanent = rs.getString("permanent");


                System.out.println("id :\t" + id + " name: " + name + "  position: " + position +
                        " Birth day : " + birth_date + " contact number : " + contact+"  permanent : "+permanent);
            }

        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

    /**
     *
     * insert user entered data in the employee table.
     *
     * @param name employee name
     * @param position position of the employee
     * @param birthDay date of birth
     * @param contact  contact number
     */
    public void insertEmployee( String name,String position,String birthDay,String contact,String permanent) {

        try {

            String query = "insert into employee(name,position,birth_day,contact_number,permanent) " +
                    "values ( ?, ?, ?, ?, ? )";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, name);
            preparedStmt.setString(2, position);
            preparedStmt.setString(3, birthDay);
            preparedStmt.setString(4, contact);
            preparedStmt.setString(5, permanent);

            preparedStmt.execute();


        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

    /**
     *
     * update user entered data in the employee table by given employee id.
     *
     * @param name employee name
     * @param position position  of employee
     * @param birthDay date of birth
     * @param contact contact number
     * @param empId employee id to identify employee
     */
    public void updateEmployee( String name,String position,String birthDay,String contact,String permanent, int empId) {

        try {

            String query = "update employee set name = ?, position= ?,birth_day=?, contact_number=?, permanent=? where id=" + empId;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, name);
            preparedStmt.setString(2, position);
            preparedStmt.setString(3, birthDay);
            preparedStmt.setString(4, contact);
            preparedStmt.setString(5, permanent);

            preparedStmt.executeUpdate();


        } catch (Exception ex) {
            System.out.println("Error :" + ex);
        }

    }

    /**
     *
     * Delete employee by given employee id
     *
     * @param empId employee id to identify employee
     */
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
