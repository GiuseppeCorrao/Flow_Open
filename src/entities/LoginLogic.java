package entities;

import java.sql.*;
import java.util.List;

/**
 * @author Mirko Di Cristina
 * Class of Login Logic with SQL
 */
public class LoginLogic {

    List<User> listOfUser;
    String name;
    String surname;
    String email;
    String password;
    int age;
    Date birthday;
    String gender;


    public LoginLogic() {

    }

    public LoginLogic(String name, String surname, String email, String password, int age, Date birthday, String gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
    }

    /**
     * @author Mirko Di Cristina
     * @param registeredUsers registration parameters
     * @return User registration
     */
    public boolean register(User registeredUsers) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");

            PreparedStatement pst = connection.prepareStatement(" INSERT INTO User (User_name, User_surname, User_age, User_birthday, User_gender, User_email, User_password) VALUES (?,?,?,?,?,?,?)");

            pst.setString(1, registeredUsers.nameUser);
            pst.setString(2, registeredUsers.surnameUser);
            pst.setInt(3, registeredUsers.age);
            pst.setDate(4, (Date) registeredUsers.birthday);
            pst.setString(5, registeredUsers.gender);
            pst.setString(6, registeredUsers.email);
            pst.setString(7, registeredUsers.password);

            pst.executeUpdate();
            return true;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    /**
     * @author Mirko Di Cristina
     * @param userAccess log-in parameters
     * @return The User Log-in
     */
    public boolean login(User userAccess) {

        boolean logged;

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowOpenDev", "developer", "developer");

            PreparedStatement pst1 = connection.prepareStatement("SELECT User_id FROM User WHERE User_email = ? AND User_password = ?");
            pst1.setString(1, userAccess.email);
            pst1.setString(2, userAccess.password);

            ResultSet resultSet = pst1.executeQuery();
            logged = resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
            logged = false;
        }

        return logged;
    }

    public List<User> getListOfUser() {
        return listOfUser;
    }

}
