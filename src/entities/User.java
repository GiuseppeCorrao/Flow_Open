package entities;

import java.sql.*;
import java.util.List;


public class User {

    String nameUser;
    String surnameUser;
    int age;
    Date birthday;
    String gender;
    String email;
    String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }

    public User(String nameUser, String surnameUser, int age, Date birthday, String gender, String email, String password) {
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }


    public User() {
    }


    public List<User> takeUserFromDB(List<User> listOfUserFromDB) {

        Connection conn;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopendev", "root", "dante123");

            Statement statement = conn.createStatement();

            ResultSet pointer = statement.executeQuery("SELECT * FROM User");

            while (pointer.next()) {
                nameUser = pointer.getString("User_name");
                surnameUser = pointer.getString("User_surname");
                age = pointer.getInt("User_age");
                birthday = pointer.getDate("User_birthday");
                gender = pointer.getString("User_gender");
                email = pointer.getString("User_email");
                password = pointer.getString("User_password");

                listOfUserFromDB.add(new User(nameUser, surnameUser, age, birthday, gender, email, password));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listOfUserFromDB;
    }


    public User insertUsersFromDB(User users) {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopendev", "root", "dante123");

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO User (User_name,User_surname,User_age,User_birthday,User_gender,User_email,User_password) VALUES (?,?,?,?,?,?,?)");

            preparedStatement1.setString(1, users.nameUser);
            preparedStatement1.setString(2, users.surnameUser);
            preparedStatement1.setInt(3, users.age);
            preparedStatement1.setDate(4, users.birthday);
            preparedStatement1.setString(5, users.gender);
            preparedStatement1.setString(6, users.email);
            preparedStatement1.setString(7, users.password);

            preparedStatement1.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }


    public String getNameUser() {
        return nameUser;
    }

    @Override
    public String toString() {
        return nameUser + '\'' + surnameUser + '\'' + age + birthday + gender + '\'' + email + '\'' +password + '\'';

    }
}
