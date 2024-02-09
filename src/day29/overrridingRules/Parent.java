package day29.overrridingRules;

import day29.Appliance;

public class Parent {


    // Method overriding rules:
    // 1. Method name and parameters stays the same
    // 2. Visibility can stay the same or increased but cannot be reduced
    // 3. Return type stays the same or can be a subtype/covariant type.
    // Example: super class return type - Object, sub class return type - String

    public void method1(){

    }

    public void method2(int i){

    }

    public void method3(){

    }


    void method4(){}



    public int method5(){
       return 7;
    }


    public Object method8(){
        return null;
    }

    public Appliance method9(){
        return null;
    }

}
