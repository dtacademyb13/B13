package day32;

public class CastingObjects {


    public static void main(String[] args) {


        double price = 23.99;
        int priceAsWhole = (int)price; // explicit downcasting
        System.out.println(priceAsWhole);

        int i = 6;
//        double iAsDouble = i; // implicit upcasting
        double iAsDouble = (double) i; // explicit upcasting
        System.out.println(iAsDouble);


        // Object compatibility/assignability is possible between subtype and supertype
        // You can assign an object of subtype to a refrence of a super type

        // Chrome chrome  = new Browser(); //can't do that
//        Browser browser = new Chrome();
        Browser browser = (Browser) new Chrome(); // implicit upcasting of subtype to a supertype

        Chrome chrome =  new Chrome();
//        Browser browser1 = (Browser) chrome;
        Browser browser1 = chrome;


         Browser myBrowser =  new Edge();
         Edge edge = (Edge) myBrowser; // explicit downcasting of the reference




        // We generally need explicit downcasting when we need a supertype have access to a subclass method

        // Ex: When we store different objects into a coolection of genereic type like Object
        //  then when we need to work with individual objects, we need to cast it down to a specific subtype


        Object object = new String("java");
        System.out.println(object);
//        System.out.println(object.substring(1));
        System.out.println( ( (String) object ).substring(1));
//        String str = (String)object;
//        System.out.println(str.substring(2));


        Object[] objects =  { new String("Java"), new String("python"), 45, 4.5, true};

        Object object2 = objects[1];
        String str2 = (String) objects[1];
        System.out.println(((String)object2).toUpperCase());


//       String str3 =  (String) objects[2];

       // ClassCastException occurs when casting to an incompatible type


        Browser browser2 = new Chrome();
        Chrome chrome1 = (Chrome)browser2;

        // For casting to be successful, the actual object behinf the refreence should be compatible with the class that you are casting to

        // instanceof  ->    refrence instanceof Class   ->   browser instanceOf Chrome
        // instanceof checks if the ACTUAL OBJECT behind the reference is compatible wuth the class that you are casting to
       // browser instanceof Edge -> is the actual object behind browser reference compatible with Edge class
           Browser browser3 = new Edge();

        System.out.println(browser3 instanceof Edge);
        System.out.println(browser3 instanceof Chrome);
        System.out.println(browser3 instanceof Browser);
//

        if(browser3 instanceof Chrome){
            Chrome chrome2 = (Chrome)browser3;
        }else {
            System.out.println("Downcasting is not possible");
        }



        Object[] objs = {"java", "python", "scala", "clojure", 34, 5.7, true, 's' };

        for (Object obj : objs) {
            if(obj instanceof String){
                System.out.println( ( (String) obj ).toUpperCase()  );
            }

        }





    }
}
