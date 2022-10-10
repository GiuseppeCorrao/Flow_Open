package entities;

import java.time.LocalDate;
import java.util.Date;

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

    @Override
    public String toString() {
        return nameUser + "\n" + surnameUser + "\n" + age + "\n" + birthday + "\n" + gender + "\n" + email + "\n" + password;
    }

}



