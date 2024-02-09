package day34.project;

public class HealthcareProfessional {

    private String name;
    private int yearOfExperience;

    public HealthcareProfessional(String name, int yearOfExperience) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return "HealthcareProfessional{" +
                "name='" + name + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
