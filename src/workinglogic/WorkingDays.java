package workinglogic;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WorkingDays{

    LocalDate workingDays;
    LocalDateTime workingHours;
    DAYS days;


    public WorkingDays(LocalDate workingDays,LocalDateTime workingHours, DAYS days) {
        this.workingDays = workingDays;
        this.workingHours = workingHours;
        this.days = days;
    }
}
