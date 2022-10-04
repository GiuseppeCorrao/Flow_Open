import entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class UserTest extends User {

    /**
     * @author Samuele Catalano
     * @BeforeRun add a User by the DevStart class on DB with value nameUser 'Samuele'.
     */
    @Test
    void takeUserFromDBTestWithTrueCondition() {
        List<User> list = new ArrayList<>();

        takeUserFromDB(list);

        Assertions.assertTrue(list.get(0).getNameUser().equals("Samuele"));

    }

    @Test
    void takeUserFromDBTestWithFalseCondition() {
        List<User> list = new ArrayList<>();

        takeUserFromDB(list);

        Assertions.assertFalse(list.get(0).getNameUser().equals("Mimmo"));

    }
}


