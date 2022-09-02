package entities;

import workinglogic.WorkingDays;

public class Employees {

    String nameEmployee;
    String surnameEmployee;
    WorkingDays workingDays;

    public Employees(String nameEmployee,String surname, WorkingDays workingDays) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.workingDays = workingDays;
    }

    void dayCheck(){};
    void seeQualifications(){};
    void salary(){};

}
