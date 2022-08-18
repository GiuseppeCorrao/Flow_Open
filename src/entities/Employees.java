package entities;

import motherclass.FlowOpen;
import products.Brand;
import workinglogic.WorkingDays;

public class Employees extends FlowOpen {

    String nameEmployee;
    String surnameEmployee;
    WorkingDays workingDays;

    public Employees(String name, String description, String[] contact, String address, Brand brand, String nameEmployee,
                     String surname, WorkingDays workingDays) {
        super(name, description, contact, address, brand);
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.workingDays = workingDays;
    }

    void dayCheck(){};
    void seeQualifications(){};
    void salary(){};

}
