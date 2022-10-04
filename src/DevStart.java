import java.sql.*;


public class DevStart {

    public static void main(String[] args) {
        insertForTest();

    }

    /**
     * @author = Samuele Catalano
     * @version 1.0
     * This method is only for testing the method of User, it is not for the real creation of users.
     */
    public static void insertForTest() {

        Connection conn;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopenDev", "developer", "developer1_");

            PreparedStatement pst = conn.prepareStatement("INSERT INTO User (User_name) VALUES (?);");
            pst.setString(1, "Samuele");
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

