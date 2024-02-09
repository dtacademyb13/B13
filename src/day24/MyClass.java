package day24;

public class MyClass {

    int instanceCount;
    static int staticCount;

    public MyClass() {
        instanceCount++;
        staticCount++;
    }

//    public void printCounts(){
//        System.out.println("Static variable: " + staticCount);
//        System.out.println("Instance variable: " + instanceCount);
//    }


    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();

        System.out.println(myClass3.instanceCount); //1
        System.out.println(myClass3.staticCount); //3
        System.out.println(MyClass.staticCount); //3
        System.out.println(myClass2.staticCount); //3

        // Changing a static variable through an object

        myClass1.staticCount = 99;

        System.out.println(myClass3.staticCount);


        // Changing an instance variable

        myClass1.instanceCount = 44;

        System.out.println(myClass3.instanceCount);

    }

}
