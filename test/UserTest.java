import entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    void takeUserObjectTest() {
        User user = new User("email", "password");
        List<User> list = new ArrayList<>();

        user.takeUserObjects(list);

        Assertions.assertFalse(list.isEmpty());
    }

}
