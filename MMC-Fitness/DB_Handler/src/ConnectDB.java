import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String jdbcURL = "jdbc:sqlserver://localhost:1433;";
    public static void main(String[] args) {
        System.out.println("Program started");
        try {
            Class.forName(jdbcDriver).newInstance();
            System.out.println("JDBC driver loaded");
        } catch (Exception err) {
            System.err.println("Error loading JDBC driver");
            err.printStackTrace(System.err);
            System.exit(0);
        }

        Connection databaseConnection= null;
        try {
            //Connect to the database
            databaseConnection = DriverManager.getConnection(jdbcURL, "", "");

            System.out.println("Connected to the database");
        }
        catch (SQLException er){

        }
    }
}
