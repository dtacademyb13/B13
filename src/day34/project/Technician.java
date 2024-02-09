package day34.project;

import java.util.List;

public class Technician extends HealthcareProfessional{

    private List<String> equipmentHandled;

    public Technician(String name, int yearOfExperience, List<String> equipmentHandled) {
        super(name, yearOfExperience);
        this.equipmentHandled = equipmentHandled;
    }

    public List<String> getEquipmentHandled() {
        return equipmentHandled;
    }

    public void setEquipmentHandled(List<String> equipmentHandled) {
        this.equipmentHandled = equipmentHandled;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "equipmentHandled=" + equipmentHandled +
                "} " + super.toString();
    }
}
