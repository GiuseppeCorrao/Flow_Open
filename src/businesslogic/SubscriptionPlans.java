package businesslogic;

import entities.Users;
import products.Brand;

import java.time.LocalDate;
import java.util.List;

public class SubscriptionPlans extends Users {

    public double price;

    SubscriptionPlans (){}

    public SubscriptionPlans(String name, String description, String[] contact, String address, Brand brand, String nameUser,
                             String surnameUser, int age, LocalDate birthday, String sex, String email, String password, List<Object> chart) {

    }

    /**
     * @param users of user subscription plans
     * this method check if the user is subscripted
     */
    public void subscriptionCheck(Users users) {

        if (users.getNameUser() != null && users.getSurnameUser() != null && users.getEmail() != null && users.getSex()
                != null && users.getBirthday() != null && users.getPassword() != null) {
            System.out.println("subscription corrected");
        }
    }

}
