package com.company;

public class LessonOne {
    public static void main (String [] args){
        People people1 = new People();
        people1.myByte = 35;
        people1.myShort = 555;
        people1.myInt = 3333;
        people1.myLong = 11111;
        people1.myFloat = 66.33f;
        people1.myDouble = 33.44;
        people1.myChar = 'c';
        people1.myBoolean = false;
        System.out.println(people1.myByte);
        System.out.println(people1.myShort);
        System.out.println(people1.myInt);
        System.out.println(people1.myLong);
        System.out.println(people1.myFloat);
        System.out.println(people1.myDouble);
        System.out.println(people1.myChar);
        System.out.println(people1.myBoolean);
    }
}

class People{
    byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    char myChar;
    boolean myBoolean;
}
