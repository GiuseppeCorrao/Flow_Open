package entities;

import java.time.LocalDate;
import java.util.List;

public class Users{

    private String nameUser;
    private String surnameUser;
    private int age;
    private LocalDate birthday;
    private String sex;
    private String email;
    private String password;

    public Users() {

    }

    public Users(String nameUser, String surnameUser, int age, LocalDate birthday, String sex, String email, String password) {
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * this method is when the user want signup
     */
    public void signIn() {

        new Users();

        nameUser = getNameUser();
        surnameUser = getSurnameUser();
        sex = getSex();
        email = getEmail();
        birthday = getBirthday();
        password = getPassword();
        System.out.println("nameUser: " + nameUser + "\n" + "surname : " + surnameUser + "\n" + "sex: " + sex +
                "\n" + "email: " + email + "\n" + "birthday: " + birthday + "\n" + "password: " + "*".repeat(password.length()));

    }


    /**
     * when the user want to loggin
     */
    void login() {

        if (this.email.equals(getEmail()) && this.password.equals(getPassword())) {
            System.out.println("you are loggin");
        } else {
            System.out.println("the dates is incorrect, please try");
        }

    }
}
