package com.tutorial.keywords;

public class Enum {
    //defining the enum inside the class
    public enum Season {WINTER, SPRING, SUMMER, FALL}
    enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    //main method
    public static void main(String[] args) {
    //traversing the enum
        for (Season s : Season.values())
            System.out.println(s);
        System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());

        Day day=Day.MONDAY;

        switch(day){
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            default:
                System.out.println("other day");
        }
    }

}
