import java.sql.Connection;
import java.sql.DriverManager;
 
class connection {
 
    private static final String url = "jdbc:mysql://localhost";
 
    private static final String user = "root";
 
    private static final String password = "redhat@123";
 
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
