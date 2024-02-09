package day15;

public class BreakAndContinueInNestedLoops {


    public static void main(String[] args) {


      OUTER:for (int i = 1; i <=5; i++) {

           for (int j = 1; j <=5 ; j++) {
                if(i == 3){
                    break OUTER;
                }
                System.out.print( "(" + i + "," + j + ")");

            }
            System.out.println();
            
        }
        
        
        
        
    }
}
