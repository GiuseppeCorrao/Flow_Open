import entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UserTest extends User {

    /**
     * @author Samuele Catalano
     * @BeforeRun add a User by the DevStart class on DB with value nameUser 'Samuele'.
     */
    @Test
    void takeUserFromDBTestWithTrueCondition() {
        List<User> list = new ArrayList<>();

        takeUserFromDB(list);

        Assertions.assertEquals("Samuele", list.get(0).getNameUser());

    }

    @Test
    void takeUserFromDBTestWithFalseCondition() {
        List<User> list = new ArrayList<>();

        takeUserFromDB(list);

        Assertions.assertNotEquals("Mimmo", list.get(0).getNameUser());

    }

    @Test
    public void insertUsersToDBTest(){
        User user= new User("Maria", "Blu", 20, Date.valueOf("2002-1-04"), "Female", "mariablu@gmail.com", "mariablu");
        User user2= new User("Franco", "Marrone", 19, Date.valueOf("2003-1-27"), "Male", "francomarrone@gmail.com", "francomarrone");

        User userNew= insertUsersToDB(user);

        Assertions.assertNotEquals(user2, userNew);
    }
}



