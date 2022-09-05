package entities;

public class Employees {

    private String nameEmployee;
    private String surnameEmployee;
    private int workingDays;
    private Qualification qualification;

    public Employees(String nameEmployee, String surnameEmployee, int workingDays, Qualification qualification) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.workingDays = workingDays;
        this.qualification = qualification;
    }


    public int dayCheck() {
        if (workingDays <= 30) {
            System.out.println("il dipendente " + nameEmployee + " ha lavorato più di 30 giorni consecutivamente, e avrà un giorno pagato alle terme");
            return getWorkingDays();
        } else if (workingDays <= 60) {
            System.out.println("il dipendente " + nameEmployee + " ha lavorato più di 60 giorni consecutivamente, e avrà 300 euro in più nella busta paga");
            return getWorkingDays();
        } else {
            System.out.println("il dipendente non ha il diritto all'agevolazione");
            return getWorkingDays();
        }
    }


    public Qualification salary() {
        switch (qualification) {
            case CapoReparto:
                System.out.println("lo stipendio di un capo reparto è di 1600 euro mensili");
                return Qualification.CapoReparto;

            case Manager:
                System.out.println("lo stipendio di un maneger è di 2000 euro mensili");
                return Qualification.Manager;

            case Employees:
                System.out.println("lo stipendio di un semplice dipendente è di 1250 euro mensili");
                return Qualification.Employees;

            case BrandManager:
                System.out.println("lo stipendio di brand manager è di 1500 euro mensili");
                return Qualification.BrandManager;

            case ProjectManager:
                System.out.println("lo stipendio di project manager è di 1300 euro mensili");
                return Qualification.ProjectManager;

            default:
                System.out.println("non hai una qualifica");
                return qualification;
        }
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public void setSurnameEmployee(String surnameEmployee) {
        this.surnameEmployee = surnameEmployee;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

}