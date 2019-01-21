import java.util.Scanner;
import java.sql.*;

public class App2 {

    //CONN SETTINGS
    static String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
    static String user = "root";
    static String psw = "";

    public static void main(String[] args) {
        //createStudent();
        //deleteStudent();
        //updateStudent();
        showStudent();
    }

     //CONNECT AND WRITE TO DB
    public static Connection connect() {
        try {
            Connection db = DriverManager.getConnection(url, user, psw);
            return db;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void execute(Connection db, String sql){
        Statement st;
        try {
            st = db.createStatement(); //  the envelope for the letter
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //create a new student
    public static void createStudent(){
        // SCANNING DATA FROM KEYBOARD
        Scanner in = new Scanner(System.in);
        String fn, ln;
        Integer a;

        System.out.println( "Your firstname: ");
        fn = in.next();

        System.out.println( "Your lasname: ");
        ln = in.next();

        System.out.println( "Your age: ");
        a = in.nextInt();

        String sql = "INSERT INTO students VALUES( '"+fn+"', '"+ln+"', "+a+" )"; //the letter to be sent
        Connection db = connect();
        execute(db, sql);
    }

    public static void deleteStudent(){
        // SCANNING DATA FROM KEYBOARD
        Scanner in = new Scanner(System.in);
        String fn, ln;
        System.out.println("Which student to delete?");
        System.out.println( "Firstname: ");
        fn = in.next();

        System.out.println( "Lastname: ");
        ln = in.next();

        String sql = "DELETE FROM students WHERE firstname = '"+fn+"' AND lastname = '"+ln+"' ";
        Connection db = connect();
        execute(db, sql);
    }

    public static void updateStudent(){
        // SCANNING DATA FROM KEYBOARD
        Scanner in = new Scanner(System.in);
        String fn, ln;
        Integer a;

        System.out.println("Who's age to update?");
        System.out.println( "Your firstname: ");
        fn = in.next();

        System.out.println( "Your lasname: ");
        ln = in.next();

        System.out.println( "New age: ");
        a = in.nextInt();

        String sql = "UPDATE students SET age = "+a+" WHERE firstname = '"+fn+"' AND lastname = '"+ln+"' "; //the letter to be sent
        Connection db = connect();
        execute(db, sql);
    }

    public static void showStudent(){
        String sql = "SELECT * FROM students";
        Connection db = connect();

        Statement st;
        try {
            st = db.createStatement(); //  the envelope for the letter
            ResultSet r = st.executeQuery( sql ); //simple execute() does not display the response.
            while(r.next()){
                System.out.print(r.getString( "firstname") + " ");
                System.out.print(r.getString( "lastname") + " ");
                System.out.println(r.getInt( "age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


//ALTER TABLE students ADD COLUMN age INT(2);