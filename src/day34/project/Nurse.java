package day34.project;

public class Nurse extends HealthcareProfessional{

    private String department;

    public Nurse(String name, int yearOfExperience, String department) {
        super(name, yearOfExperience);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
