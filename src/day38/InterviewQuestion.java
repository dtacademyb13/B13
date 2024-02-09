package day38;

import java.util.*;



public class InterviewQuestion {




    public static void main(String[] args) {


        List<String> colors =  List.of("Blue", "White", "Black", "Green", "White", "Gray");
        List<String> patterns =  List.of("Checked", "Plain", "Polkadot", "Stripe", "Flannel", "Oval");

        List<Sock> sockList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            sockList.add(
                    new Sock(
                            colors.get(new Random().nextInt(colors.size())),
                            patterns.get(new Random().nextInt(patterns.size()))
                    )
            );

        }

        sockList.forEach(s -> System.out.println(s));

        System.out.println("The sock with the most frequency: " + findTheMostFrequent(sockList));
    }



    public static Sock findTheMostFrequent(List<Sock> sockList){

        Map<Sock, Integer> sockMap =  new HashMap<>();

        for(Sock sock: sockList){
            if(!sockMap.containsKey(sock)){
                sockMap.put(sock,1);
            }else{
                Integer val = sockMap.get(sock);
                val++;
                sockMap.put(sock,val);
            }
        }
        sockMap.forEach((k,v) -> System.out.println(k + "=> " + v));

        //Find the most frequently occcuring Sock

        int max = Integer.MIN_VALUE;

        Sock mostFrequentOne = null;
        for(Map.Entry<Sock,Integer> entry: sockMap.entrySet()){
             if(entry.getValue() > max){
                 max = entry.getValue();
                 mostFrequentOne = entry.getKey();
             }
        }


        return mostFrequentOne;
    }
}
