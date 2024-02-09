package day08;

public class MultiwayELseIfInMethods {


    public static void main(String[] args) {

        System.out.println(getBookRecommendationForAMood("sad"));
        System.out.println(getBookRecommendationForAMood("bad"));

    }


    public static String  getBookRecommendationForAMood(String mood){

        if(mood.equals( "happy")){
           return "How about reading a light-hearted romance novel";
        }else if (mood.equals("sad")) {
            return "Maybe a motivational self-help book would lift your spirits?";
        } else if (mood.equals("adventurous")) {
           return "Ever thought of diving into a thrilling mystery novel?";
        } else if (mood.equals("curious")) {
            return "A science fiction novel might intrigue you!";
        }else {
            return "I'm not sure what to suggest for that mood. Maybe just pick up any book you like!";
        }




    }



//    public static int  divide(int a, int b){
//
//             if(b != 0){
//                  return a/b;
//             }
//
//    }

    public static int  square(int a){

        if(a > 0){
            return a * a;
        }else{
           return a;
        }

    }



}
