package day31;

public class Employee {

    double salary = 50000;

    private void doSomethingInternal(){
        System.out.println("Employee internal operation");
    }
   public static void generateEmployeeId(){
       System.out.println("Employee ID");
   }
    public void getPaid(){
        System.out.println("80K");
    }

    public void getPaid(double bonus){
        System.out.println("80K plus " + bonus);
    }


    public static void main(String[] args) {


        Employee employee = new Developer();
        employee.getPaid();

//        employee.getPaid(true); // compile time error
        employee.getPaid(20);

        // Run-time polymorphism -> getPaid() because it is overridden method in an Employee
        // Compile time polymorphism -> getPaid(double bonus) because it is overloaded in the Employee class


        // Anything that is not overridden (variables, static methods, private methods, overloaded methods) are determined during compile time based on the Reference type (Declared Type)
        // All  overriden methods are determined during run time based on the actual type (Object type)

        System.out.println(employee.salary);
        employee.getPaid(50);
        employee.generateEmployeeId();
        employee.doSomethingInternal();



    }
}
