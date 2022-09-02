package workinglogic;

import motherclass.FlowOpen;
import products.Brand;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WorkingDays{

    LocalDate workingDays;
    LocalDateTime workingHours;
    DAYS days;


    public WorkingDays(String name,String description,String[] contact,String address,Brand brand, LocalDate workingDays,
                       LocalDateTime workingHours, DAYS days) {
        this.workingDays = workingDays;
        this.workingHours = workingHours;
        this.days = days;
    }
}
