import entities.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsersTest {
    public void signinTest() {
        Users users = new Users();
        users.setNameUser("Giacomo");
        users.setSurnameUser("Ayeye");
        users.setBirthday(LocalDate.of(1977, 7, 1));
        users.setEmail("Sow@Sow.sow");
        users.setPassword("123");


        Assertions.assertNotNull(users.getNameUser());
        Assertions.assertNotNull(users.getSurnameUser());
        Assertions.assertNotNull(users.getBirthday());
        Assertions.assertNotNull(users.getEmail());
        Assertions.assertNotNull(users.getPassword());
    }

    @Test
    public void loginTest() {
        Users users = new Users();
        users.setEmail("Sow@Sow.sow");
        users.setPassword("123");

        String email = "Sow@Sow.sow";
        String password = "123";

        Assertions.assertEquals(email, users.getEmail());
        Assertions.assertEquals(password, users.getPassword());
    }
}
