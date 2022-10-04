package entities;
import products.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class User {

    String nameUser;
    String surnameUser;
    int age;
    LocalDate birthday;
    String sex;
    String email;
    String password;
    Connection connection;


    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }

    public User(String nameUser, String surnameUser, int age, LocalDate birthday, String sex, String email, String password) {
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.age = age;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.password = password;

    }


    public void registerUser(String nameUser, String surnameUser, Integer age, Date birthday, Brand sex, String email, String password) throws SQLException {
        PreparedStatement preparedStatement= this.connection.prepareStatement("insert into User (User_name, User_surname, User_age, User_birthday, User_sex, User_email, password) values(?,?,?,?,?,?,?)");
        preparedStatement.setString(1, "nameUser");
        preparedStatement.setString(2, "surnameUser");
        preparedStatement.setString(3, "age");
        preparedStatement.setString(4, "birthday");
        preparedStatement.setString(5, "sex");
        preparedStatement.setString(6, "email");
        preparedStatement.setString(7, "password");
        preparedStatement.executeUpdate();
    }
}



