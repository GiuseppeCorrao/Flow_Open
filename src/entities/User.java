package entities;

import java.sql.*;
import java.util.List;


public class User {

    String nameUser;
    String surnameUser;
    int age;
    Date birthday;
    String sex;
    String email;
    String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }


    public User(String nameUser, String surnameUser, int age, Date birthday, String sex, String email, String password) {
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.age = age;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.password = password;

    }


    public User() {
    }

    public List<User> takeUserFromDB(List<User> listOfUserFromDB) {

        Connection conn;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopenDev", "developer", "developer1_");

            Statement statement = conn.createStatement();

            ResultSet pointer = statement.executeQuery("SELECT * FROM User");

            while (pointer.next()) {
                nameUser = pointer.getString("User_name");
                surnameUser = pointer.getString("User_surname");
                age = pointer.getInt("User_age");
                birthday = pointer.getDate("User_birthday");
                sex = pointer.getString("User_sex");
                email = pointer.getString("User_email");
                password = pointer.getString("User_password");

                listOfUserFromDB.add(new User(nameUser, surnameUser, age, birthday, sex, email, password));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listOfUserFromDB;
    }

    public String getNameUser() {
        return nameUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "nameUser='" + nameUser + '\'' +
                ", surnameUser='" + surnameUser + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';

    }
}
