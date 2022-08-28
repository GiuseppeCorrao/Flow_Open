package entities;

import lombok.Builder;
import motherclass.FlowOpen;
import products.Brand;

import java.time.LocalDate;
import java.util.List;

public class Users extends FlowOpen {

    String nameUser;
    String surnameUser;
    int age;
    LocalDate birthday;
    String sex;
    String email;
    String password;
    List<Object> chart;

    public Users(String name, String description, String[] contact, String address, Brand brand,String nameUser, String surnameUser,
                 int age, LocalDate birthday, String sex, String email, String password, List<Object> chart) {
        super(name, description, contact, address, brand);
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.chart = chart;
    }


    void signIn(){};
    void login(){};
    void totalPrice(){};
    void sum(){};


}
