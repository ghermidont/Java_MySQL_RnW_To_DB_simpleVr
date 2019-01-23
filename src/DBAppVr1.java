/*import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

       //CONN SETTINGS
        String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        String user = "root";
        String psw = "";

        // SCANNING DATA FROM KEYBOARD
        Scanner in = new Scanner(System.in);
        String fn, ln;

        System.out.println( "Your firstname: ");
        fn = in.next();

        System.out.println( "Your lasname: ");
        ln = in.next();

        //CONNECT AND WRITE TO DB
        // 1. connect settings
        try {
            Connection db = DriverManager.getConnection(url, user, psw);
            // 2. statement
            String sql = "INSERT INTO students VALUES( '"+fn+"', '"+ln+"' )"; //thed letter to be sent
            Statement st = db.createStatement(); //  the envelope for the letter
            // 3. execute
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
*/