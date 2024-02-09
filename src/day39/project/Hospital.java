package day39.project;

import java.util.*;

public class Hospital {

    private Set<Doctor> doctors = new HashSet<>();
    private Set<Patient> patients =  new HashSet<>();

    private List<Appointment> appointments = new ArrayList<>();

    private Queue<Patient> emergencyQueue = new LinkedList<>();

    private Stack<String> roomStack = new Stack<>();

    private Map<String, String> roomAllocationMap = new TreeMap<>();

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Queue<Patient> getEmergencyQueue() {
        return emergencyQueue;
    }

    public Stack<String> getRoomStack() {
        return roomStack;
    }

    public Map<String, String> getRoomAllocationMap() {
        return roomAllocationMap;
    }

    public Hospital(){
        // add 10 rooms to the hospital
        for (int i = 0; i < 10; i++) {
            roomStack.push("Room " + (i+1));
        }
    }



    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
        System.out.println("Doctor added successfully");
    }

    public void addPatient(Patient patient){

        if(patients.contains(patient)){
            System.out.println("The patient is already in the system.");
            return;
        }

        patients.add(patient);
        System.out.println("Patient added successfully");
    }

    public void scheduleAppointment(Appointment a){
        appointments.add(a);
        System.out.println("Appointment added successfully.");
    }

    public void attendEmergency(Patient patient){
        emergencyQueue.offer(patient);
        System.out.println("Patient is added to the emergency room.");
    }

    public void allocateRoom(Patient patient){

        if(roomStack.isEmpty()){
            System.out.println("No rooms available.");
            return;
        }


        // Get the latest available room from the stack

        String room = roomStack.pop();
        String id = patient.getId();
        roomAllocationMap.put(id, room);
        System.out.println("Patient with id " + id + " is allocated to a " + room);



    }

    public void releaseRoom(String patientId){
        String roomToBeRemoved = roomAllocationMap.remove(patientId);
        roomStack.push(roomToBeRemoved);
        System.out.println(roomToBeRemoved + " is released");



    }

    public void viewDoctors(){
//        for (Doctor doctor : doctors) {
//            System.out.println(doctor);
//        }

        doctors.forEach(System.out::println);
    }


    public void viewPatients(){
        patients.forEach(System.out::println);
    }


    public void viewAppointments(){
        appointments.forEach(System.out::println);
    }

    public void viewEmergencyQueue(){
        emergencyQueue.forEach(System.out::println);
    }


    public void viewRooms(){
        roomStack.forEach(System.out::println);
    }
    public void viewRoomAllocations(){

//        for (Map.Entry<String, String> entry : roomAllocationMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        roomAllocationMap.forEach((k,v) -> System.out.println(k + ": " + v));
    }




}
