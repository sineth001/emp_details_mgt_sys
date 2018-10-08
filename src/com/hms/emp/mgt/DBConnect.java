package com.hms.emp.mgt;



import java.util.Scanner;

import java.sql.*;

public class DBConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;


    public DBConnect(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_mgt_sys","user","password");
            st= con.createStatement();

        }catch (Exception ex){
            System.out.println("Error :"+ ex);
        }
    }

    public void viewEmployee(){

        try{

            String query="select * from employee";
            rs= st.executeQuery(query);
            System.out.println("Recoards from database");
            while (rs.next()){
                int id =rs.getInt("id");
                String name =rs.getString("name");
                String position =rs.getString("position");
                String birth_date =rs.getString("birth_day");
                String contact =rs.getString("contact_number");



                System.out.println("id :"+id+" name: "+name+"  position: "+position+" Birth day : "+birth_date+" contact number "+ contact);
            }

        }catch (Exception ex){
            System.out.println("Error :"+ ex);
        }

    }
    public void enterEmployee(){

        try{

            Scanner keyboard=new Scanner(System.in);
            System.out.println("Employee  name");
            String name=keyboard.nextLine();
            System.out.println("Position of employee");
            String position=keyboard.nextLine();
            System.out.println("Date of birth (yyyy-mm-dd)");
            String birth_day=keyboard.nextLine();

            System.out.println("Employee contact");
            String contact=keyboard.nextLine();

            System.out.println("------------------------");
            System.out.println("Employee detail that you entered are followings.");

            System.out.println("Name :"+name);
            System.out.println("Position : "+position);
            System.out.println("Date of birth : "+birth_day);
            System.out.println("Contact : "+contact);


//            preparedStmt.setString(1,name);
//            preparedStmt.setString(2,position);
//            preparedStmt.setString(3, birth_day);
//            preparedStmt.setString(4, contact);



            String query="insert into employee(name,position,birth_day,contact_number) " +
                            "values (default,"+name+","+position+","+birth_day+","+contact+" )";
            rs= st.executeQuery(query);

        }catch (Exception ex){
            System.out.println("Error :"+ ex);
        }

    }

}
