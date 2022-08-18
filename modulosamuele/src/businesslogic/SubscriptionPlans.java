package businesslogic;

import entities.Users;

import java.time.LocalDate;
import java.util.List;

public class SubscriptionPlans extends Users {

    double price;

    public SubscriptionPlans(String name, String surname, int age, LocalDate birthday, String sex, String email, String password,
                             List<Object> chart, double price) {
        super(name, surname, age, birthday, sex, email, password, chart);
        this.price = price;
    }

    void subscriptionCheck() {
    }


}
