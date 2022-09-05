import static org.junit.jupiter.api.Assertions.*;

import entities.Employees;
import entities.Qualification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {

    @Test
    void dayCheckCase30(){
        Employees employees= new Employees("Luca", "Verdi", 30, Qualification.CapoReparto);
        assertEquals(30, employees.dayCheck());
    }


    @Test
    void dayCheckCase60(){
        Employees employees= new Employees("Luca", "Verdi", 60, Qualification.CapoReparto);
        assertEquals(60, employees.dayCheck());
    }

    @Test
    void salaryCase2(){
        Employees employees= new Employees("Luca", "Verdi", 30, Qualification.ProjectManager);
        assertEquals(Qualification.ProjectManager, employees.salary());
    }

    @Test
    void salaryCase1(){
        Employees employees= new Employees("Luca", "Verdi", 30, Qualification.BrandManager);
        assertEquals(Qualification.BrandManager, employees.salary());
    }
}
