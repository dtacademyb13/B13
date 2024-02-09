package day31;

public class DynamicBinding {


    public static void main(String[] args) {


        // Static vs Dynamic Binding
        // Compile-Time vs Runtime Polymorphism
        // Early vs Late Binding
        // Method Overloading vs Method Overriding


        Employee employee1 = new ScrumMaster();

//        printEmployeeSalary(new Employee());
//        printEmployeeSalary(new Developer());
//        printEmployeeSalary(new ScrumMaster());

//        Developer[] developers = new Developer[2];
//        developers[0] =  new Developer();

        Employee[] employees = new Employee[2];
        employees[0] = new Developer();
        employees[1] = new ScrumMaster();


        for (Employee employee: employees){
            employee.getPaid();
        }


    }

    // Polymorphism can be used in a method parameter where a parameter can be of super type
    // and the actual arguments can be of any subtype object

    public static void printEmployeeSalary(Employee employee){
        employee.getPaid();
    }

    public static Employee getEmployeeObject(){
//        return new Developer();
        return new ScrumMaster();
    }


    // Polymorphism is commonly used in collections where you declare the collection type as super type
    // and add actual objects of subtype
}
