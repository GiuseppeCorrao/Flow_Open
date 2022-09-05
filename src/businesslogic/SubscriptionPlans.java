package businesslogic;

import entities.Users;
import products.Brand;

import java.time.LocalDate;
import java.util.List;

public class SubscriptionPlans extends Users {

    double price;

    public SubscriptionPlans(String nameUser, String surnameUser, int age, LocalDate birthday, String sex, String email, String password, double price) {
        super(nameUser, surnameUser, age, birthday, sex, email, password);
        this.price = price;
    }

    void subscriptionCheck() {
    }


}
