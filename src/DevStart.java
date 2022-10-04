import entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DevStart {


    /**
     * author = Samuele Catalano
     * @param args
     * version 1.0
     * This method is only for testing the method of User, it is not for the real creation of the users.
     */
    public static void main(String[] args) {

        Connection conn;


        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopenDev", "developer", "developer1_");

            PreparedStatement pst = conn.prepareStatement("INSERT INTO User (User_name) VALUES (?);");
            pst.setString(1,"Samuele");
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

