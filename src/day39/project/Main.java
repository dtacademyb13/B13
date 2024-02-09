package day39.project;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Creating a hospital
        Hospital hospital = new Hospital();
        hospital.viewRooms();

        // Creating and adding doctors
        Doctor doctor1 = new Doctor("1", "Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("2", "Dr. Oz", "Neurology");
        Doctor doctor3 = new Doctor("3", "Dr. Banneker", "Trauma Specialist");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        // Viewing the list of doctors
        hospital.viewDoctors();
        // Creating and adding patients
        Patient patient1 = new Patient("10","Jane Smith", "Migraine");
        Patient patient2 = new Patient("11","Joe Doe", "Heart Palpitations");
        Patient patient3 = new Patient("12","David Duchovny", "Snake Bite");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(new Patient("12","David Duchovny", "Snake Bite"));
        // Viewing the list of patients
        hospital.viewPatients();
        // Scheduling appointments
        Appointment appointment1 = new Appointment(patient1,doctor2,"10 AM");
        Appointment appointment2 = new Appointment(patient2,doctor1,"11 AM");
        Appointment appointment3 = new Appointment(patient3,doctor3,"9 AM");

        hospital.scheduleAppointment(appointment1);
        hospital.scheduleAppointment(appointment2);
        hospital.scheduleAppointment(appointment3);
        // Viewing the list of appointments
        hospital.viewAppointments();
        // Attending to emergency
        hospital.attendEmergency(patient3);
        hospital.attendEmergency(patient2);
        hospital.attendEmergency(patient1);

        // Viewing the emergency queue

       hospital.viewEmergencyQueue();
        // Allocating and releasing rooms
       hospital.allocateRoom(patient3);
       hospital.allocateRoom(patient2);
       hospital.allocateRoom(patient1);

        // Viewing the room allocations
        hospital.viewRoomAllocations();

        // Releasing rooms
        hospital.releaseRoom("10");

        // Viewing the room allocations after releasing rooms
        hospital.viewRoomAllocations();

        // Allocate the next available room to a new patient

       hospital.allocateRoom(new Patient("100", "Bob Dole", "Hip Fracture"));

       // View the new allocations

        hospital.viewRoomAllocations();

        // Sorting doctors based on their specialization in reverse order.

        Set<Doctor> doctors = hospital.getDoctors();
        List<Doctor> doctorsList = new ArrayList<>(doctors);
        doctorsList.forEach(System.out::println);
//        doctorsList.sort((a,b) -> b.getSpecialization().compareTo(a.getSpecialization()));
        doctorsList.sort(Comparator.comparing(Doctor::getSpecialization, Comparator.reverseOrder()));

        doctorsList.forEach(System.out::println);

        /// Sorting doctors based on their id


        doctorsList.sort((x,y) -> x.getId().compareTo(y.getId()));

        doctorsList.forEach(System.out::println);



    }
}
