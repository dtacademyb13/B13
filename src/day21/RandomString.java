package day21;

public class RandomString {

    public static void main(String[] args) {
        System.out.println(randomString(10));


    }

    public static String randomString(int length){
        // You can use this approach to control the characters in your random string
        String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&";
        String randomStr = "";
        for(int i = 0; i < length; i++){
            int randIndex = (int)(Math.random() * a.length());
            randomStr += a.charAt(randIndex);
        }
        return randomStr;
    }
}
