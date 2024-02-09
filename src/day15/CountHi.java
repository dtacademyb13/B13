package day15;

public class CountHi {


    public static void main(String[] args) {

        System.out.println(countHi("abc abchi hoabc hi hoabc hi ho","hi") );
    }

    public static int countHi(String str, String searchWord){
        int count = 0;

        for (int i = 0; i <= str.length()-searchWord.length(); i++){

            String substring = str.substring(i, i + searchWord.length());

            if (substring.equals(searchWord)){
                count ++;
            }
        }
        return count;
    }
}
