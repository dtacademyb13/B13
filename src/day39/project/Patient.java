package day39.project;

import java.util.Objects;

public class Patient extends Person{

    private String ailment;

    public Patient(String id, String name, String ailment) {
        super(id, name);
        this.ailment = ailment;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(ailment, patient.ailment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ailment);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ailment='" + ailment + '\'' +
                "} " + super.toString();
    }
}
