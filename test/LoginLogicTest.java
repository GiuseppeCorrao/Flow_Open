
import entities.LoginLogic;
import entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class LoginLogicTest {

    @Test
    void RegisteredTest() {
        LoginLogic loginLogic = new LoginLogic();

        List<User> registeredUsers = new ArrayList<>();
        registeredUsers.add(new User("Mario", "Cotumaccio", 45, Date.valueOf("1976-11-27"), "male", "mkir@gmail.com", "Test01"));

        boolean logged = loginLogic.register(registeredUsers.get(0));

        Assertions.assertTrue(logged);
    }

    @Test
    void LoginTest() {
        LoginLogic loginLogic = new LoginLogic();

        List<User> enteredUsers = new ArrayList<>();
        enteredUsers.add(new User("mkir@gmail.com", "Test01"));

        boolean logged = loginLogic.login(enteredUsers.get(0));

        Assertions.assertTrue(logged);
    }


    @Test
    void LoginTestWrong() {
        LoginLogic loginLogic = new LoginLogic();

        List<User> enteredUsers = new ArrayList<>();
        enteredUsers.add(new User("mkir@gmail.com", "Test0"));

        boolean logged = loginLogic.login(enteredUsers.get(0));

        Assertions.assertFalse(logged);


    }
}

