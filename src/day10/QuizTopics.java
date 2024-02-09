package day10;

public class QuizTopics {

    public static void main(String[] args) {



        // Condition of the if statement can be anything that evaluates to true or false, including method calls

        String answer = "yes";
        if(answer.equals("yes")){  // string class method call, this method returns boolean

        }



    // There is a BIG difference between  = vs ==, common error is using = instead of ==
        boolean a = false;
        boolean b = false;

        if(a = b){  // this does not compare two values but
            // assigns the value of a b to a and final evaluation will be the new value of a (false)
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        //Another example of  = vs ==

        boolean x = false;

//        if (x == true){ // compares: false == true  -> false
        if (x = true){  // assigns: x = true ->  x's value becomes true, so the condition is true
            System.out.println("true");
        }else{
            System.out.println("false");
        }



        // this if statement looks odd but legal, if and else simply do not have any statements in their bodies
        if(false)
            ;
        else
            ;


        // Operator precedence:  = (Assignment) always happens last

        boolean b1 = false;
        boolean b2 = false;

        if(b1 = b2 == false){  // this expression is evaluated as ( b1 = (b2 == false) ) -> (b1 = true)
                               // NOT as ( (b1 = b2) == false )
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }





//        if(isLeapYear(2000)){  // my custom method call, this method returns boolean
//            System.out.println("Even");
//        }



    }


    public static boolean checkEven(int i){
        return i % 2 == 0;
    }
}
