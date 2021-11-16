package com.company;

public class Main {

    public static void main(String[] args) {
        String mytext = "Programming is amazing, no seriously";
        System.out.println(mytext.length());
        System.out.println(mytext.charAt(0));
        System.out.println(mytext.substring(0, 7));
        System.out.println(mytext.replace("ing is", "ers are"));

        int a = 'A';
        System.out.println(a);

        char b = 66;
        System.out.println(b);

        int myint = 9;
        double mydouble = myint;

        System.out.println(myint);
        System.out.println(mydouble);//widening

        double mydouble2 = 9.78;
        int myint2 = (int) mydouble2;
        System.out.println(mydouble2);
        System.out.println(myint2);//narrowing
    }
}
