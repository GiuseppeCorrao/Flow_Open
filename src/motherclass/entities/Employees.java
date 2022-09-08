package motherclass.entities;

import workinglogic.WorkingDays;

public class Employees{

    String nameEmployee;
    String surnameEmployee;
    WorkingDays workingDays;

    /**
     * @author Giuseppe Corrao
     * add this variable for LoginLogic
     */
    String email;
    String password;



    public Employees(){

    }

    public Employees(String nameEmployee,String surname, WorkingDays workingDays) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.workingDays = workingDays;
    }

    void dayCheck(){};
    void seeQualifications(){};
    void salary(){};

}
