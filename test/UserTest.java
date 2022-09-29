import entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    void takeUserObjectTestWithFullListCase() {
        User user = new User("email", "password");
        List<User> list = new ArrayList<>();

        list.add(user);

        Assertions.assertTrue(list.contains(user));
    }

    @Test
    void takeUserObjectTestWithEmptyListCase() {
        User user = new User("email", "password");

        List<User> list = new ArrayList<>();

        Assertions.assertFalse(list.contains(user));
    }
}
