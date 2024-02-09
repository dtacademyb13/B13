package day31;

public class Developer extends Employee{

    double salary = 180000;
    public void getPaid(){
        System.out.println("180K");
    }

    public static void generateEmployeeId(){
        System.out.println("Developer ID");
    }

    private void doSomethingInternal(){
        System.out.println("Developer internal operation");
    }
}
