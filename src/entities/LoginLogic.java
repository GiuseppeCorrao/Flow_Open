package entities;

import java.util.ArrayList;
import java.util.List;

public class LoginLogic{




    List<User> listOfUser;



    public LoginLogic() {
        this.listOfUser = new ArrayList<>();
    }

    /**
     * @author Giuseppe Corrao
     * @version 1.0
     * login per User
     */
    public void registered(String email,String password){
        User newUser = new User(email,password);
        this.listOfUser.add(newUser);

        }

    public List<User> getListOfUser() {
        return listOfUser;
    }

    public void setListOfUser(List<User> listOfUser) {
        this.listOfUser = listOfUser;
    }

    public String login(String email, String password) {
        for (int i = 0; i < listOfUser.size(); i++) {
            if (listOfUser.get(i).email.equals(email) && listOfUser.get(i).password.equals(password)) {
                return "you are login";
            }

        }
        return "password and email are wrong";
    }

    /**
     * @author Giuseppe Corrao
     * @version 2.0
     * login per Employees and User
     */
    /*public void registeredEmployeesAndUser(String email,String password){
        Employees newEmployees = new Employees();
        this.listOfUser.add(new User());

    }*/
}
