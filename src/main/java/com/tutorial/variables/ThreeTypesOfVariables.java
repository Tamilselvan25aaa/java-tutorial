package com.tutorial.variables;

public class ThreeTypesOfVariables {
    int a=10; //instace variable
    static int b=11; //static variable
    void printValue(){
        int c=15; //local variable
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String args[]){
        ThreeTypesOfVariables obj=new ThreeTypesOfVariables();
        obj.printValue();
    }
}
