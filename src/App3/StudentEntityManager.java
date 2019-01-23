package App3;

import java.sql.*;
import java.util.ArrayList;
//import java.util.Scanner;

public class StudentEntityManager {
    private static ArrayList<Student> studentList = new ArrayList<>();
    // метод который записывает в ДБ 1 студента
    void add(Student student){
        String sql = "INSERT INTO students VALUES( "+student.getId()+", '"+student.getFirstname()+"', '"+student.getLastname()+"', "+student.getYear_of_birth()+", "+student.getAverage_mark()+" )"; //the letter to be sent
        ConnectDB.execute(ConnectDB.connect(), sql);
    }

    // метод который удаляет студента
    void delete(Student student){
        //HW task Vr. Deletes only the specific object that we pass to the function
        String sql = "DELETE FROM students WHERE id = "+student.getId()+"";
        ConnectDB.execute(ConnectDB.connect(), sql);

        ///////////////////////Alternative version - user Input/////////////////
        // Delete the student chosen by user                                  //
        //Scanner in = new Scanner(System.in);                                //
        //System.out.println("Input the id of the student                     //
        //you want to delete from the DB:");                                  //
        //Integer StudentIdNumber = in.nextInt();                             //
        //String sql = "DELETE FROM students WHERE id = "+StudentIdNumber+""; //
        ////////////////////////////////////////////////////////////////////////
    }

    // метод который возвращает список студентов
    ArrayList<Student> displayDbRecords(){
        String sql = "SELECT * FROM students";
        //Connection db = ConnectDB.connect(); //Connection -> class from java.sql. library

       // Statement st; //Statement -> class from java.sql. library
        try {
            Statement st = ConnectDB.connect().createStatement(); //  the envelope for the letter
            ResultSet result = st.executeQuery( sql ); //simple execute() does not display the response. //ResultSet -> class from java.sql. library

            String leftAlignFormat = "| %-5s | %-11s | %-8s | %-13s | %-14s|%n";

            System.out.format("+-------+-------------+----------+---------------+---------------+%n");
            System.out.format("|  ID   |  Firstname  | Lastname | Year of birth | Average mark  |%n");
            System.out.format("+-------+-------------+----------+---------------+---------------+%n");

            while(result.next()){
                System.out.format(leftAlignFormat, result.getString( "id"), result.getString( "firstname"), result.getString( "lastname"), result.getInt( "year_of_birth"), result.getFloat( "average_mark"));
            }
            System.out.format("+-------+-------------+----------+---------------+---------------+%n");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentList;
    }
}
