package day34.project;

public class Doctor extends HealthcareProfessional{

    private String specialization;

    public Doctor(String name, int yearOfExperience, String specialization) {
        super(name, yearOfExperience);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
}
