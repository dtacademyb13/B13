package day20;

public class LocalVariable {




    public static void main(String[] args) {

        divide(2,3);
        add(3,4);
    }


    public static int divide(int a, int b){
                int c = 8;
                int d = 9;
                return 0;
    }

     // local variable - variable declared in the method
    // local variable scope is limited to the block that it is surrounded with
    public static int add(int a, int b){
//         int i = 0;
         int c = 8;
         int d = 9;

        for (int i = 0; i < 4; i++) {

            int sum = 0;
        }

        for (int i = 0; i < 4; i++) {

            int sum = 0;
        }

        if(true){
            int i = 8;
        }

//        System.out.println(sum);

        {
            int i = 0;
        }

//        System.out.println(i);


        System.out.println(c);
        return a + b;
    }
}
