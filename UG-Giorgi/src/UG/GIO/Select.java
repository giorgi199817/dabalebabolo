package UG.GIO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
    public static void main(String[] args) throws Exception {


        Class.forName("org.h2.Driver");
        Connection myConn = DriverManager.
                getConnection ("jdbc:h2:tcp://localhost/~/test", "sa","123");

        Statement myStatement = myConn.createStatement();


        ResultSet myResultSet = myStatement.executeQuery("select * from CCar");


    }
}
