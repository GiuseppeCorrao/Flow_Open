package entities;

import java.time.LocalDate;

public class User {

    String nameUser;
    String surnameUser;
    int age;
    LocalDate birthday;
    String sex;
    String email;
    String password;

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



