import entities.LoginLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginLoigcTest {

    @Test
    void RegisteredTest(){
        String email = "jojo@lol.com";
        String password = "Test";
        LoginLogic loginLogic = new LoginLogic();

        loginLogic.registered(email,password);

        Assertions.assertEquals(1,loginLogic.getListOfUser().size());
    }
    @Test
    void LoginTest(){
        String email = "jojo@lol.com";
        String password = "Test";
        String loginreturn = "you are login";
        LoginLogic loginLogic = new LoginLogic();

        loginLogic.registered(email,password);
        loginLogic.login(email,password);

        Assertions.assertEquals(loginreturn,loginLogic.login(email,password));
    }
}
