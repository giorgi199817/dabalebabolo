package UG.GIO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dellete {
    public static void main(String[] args) throws Exception{
         //ვერ დავაკავშირე. SQL-ზე მიწერდა რომ 123 არასწორი პაროლიაო.

        Class.forName("org.h2.Driver");
        Connection myConn = DriverManager.
                getConnection ("jdbc:h2:tcp://localhost/~/test", "sa","123");

        Statement myStatement = myConn.createStatement();


        String query = "DELETE FROM CCar WHERE Model='BMW'";
    }
}
