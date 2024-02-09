package day32;

import day22.Dog;

public class Browser {

    public void open(){
        System.out.println("Generic");
    }


    public Object close(){

        doSomething(new Edge());
        doSomething(new String());
        doSomething(new Dog());



        return null;
    }

    public static void main(String[] args) {
//        Object obj = new String();
//        Edge edge = (Edge)obj;
//
        Browser browser = new Chrome();
        browser.open();


        Object o = new String();

        o.toString();
        ((String)o).substring(4);

    }




    public static void doSomething(Object browser){

    }

}
