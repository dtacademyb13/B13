package day30.task;

public class Instructor extends Person{

    private String department;

    public Instructor(String name, String email, String department) {
        super(name, email);
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
        return "Instructor{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
