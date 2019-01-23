package App3;

import java.sql.*;

public class ConnectDB {
    //CONN SETTINGS
    final static String URL = "jdbc:mysql://localhost:3306/school?useSSL=false";
    final static String USER = "root";
    final static String PSW = "";

    //CONNECT AND WRITE TO DB
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PSW);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void execute(Connection db, String sqlRequest){
        try {
            Statement statement = db.createStatement(); //  the envelope for the letter
            statement.execute(sqlRequest);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
