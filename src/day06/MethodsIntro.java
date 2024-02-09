package day06;

public class MethodsIntro {




    public static void main(String[] args) {

        //DRY (Don't Repeat Yourself) principle of programming

   //   Using a method -> call or invoke a method
        // Static methods are class
        // ClassName.methodName()

//       MethodsIntro.printSmileyFace();
       printSmileyFace();
       printSmileyFace();
       printSmileyFace();




    }


    //visible to everyone      Belongs to class     does not return anything        method name     method parameters
        public                     static                  void                      printSmileyFace    ()            {

        // method body
            Smiley.doSomethin();
            System.out.println("----------SMILEY-------------");
            System.out.println("    .-\"\"\"\"\"\"\"-.    ");
            System.out.println("  .'  _     _  '.  ");
            System.out.println(" /  (_\\   /_)  \\ ");
            System.out.println("|   \\-'\\\"/`-    |");
            System.out.println(" \\    '-'    /  ");
            System.out.println("  '.       .'    ");
            System.out.println("    `-...-'      ");

    }


}
