package day20;

public class LocalVariable2 {




    public static void main(String[] args) {

//        divide(10,5);

        int a = 10;
        square(a);

        System.out.println("In the main method: a  is " + a);

    }


    public static void square(int a){
                a = a*a;
        System.out.println("Inside the square method: a is " + a);
    }


}
