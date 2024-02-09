package day18;

public class NpException {


    public static void main(String[] args) {



        String[] dataArr = new String[4];
          dataArr[0] = "Bill";
           dataArr[1] = "Steve";
           dataArr[2] = "Larry";
         for(String data : dataArr){
            System.out.print(data.toUpperCase()+" ");
        }

         //Calling a method on an object with null value results in NullPointerException

    }
}
