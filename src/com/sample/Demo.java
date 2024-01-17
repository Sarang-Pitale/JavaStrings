package com.sample;


import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        String str=new String("This is a String"); // 1st way
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println("The Value of str is:"+str);
        System.out.println(str.toUpperCase());//1st method
        System.out.println("i am another string".toUpperCase()); //2nd way
        String dstr="the default String"; //3rd way
        System.out.println(dstr.toLowerCase()); //2nd Method
        System.out.println(dstr.charAt(1)); //4th Method
        System.out.println(dstr.length()); //5th Method
        System.out.println(dstr.substring(4,11)); //6th Method
        System.out.println(dstr.indexOf("d")); //4rd Method
        System.out.println(dstr.lastIndexOf('t')); //4rd Method
        System.out.println(dstr.indexOf('t',dstr.indexOf("t")+1)); //4rd Method
        System.out.println(dstr.substring(dstr.indexOf("d"),dstr.indexOf('t',dstr.indexOf("t")+1)+1)); //4rd Method
        System.out.println("I Like".concat("Java")); //4rd Method
        String str1="the default STring";
        System.out.println(str1.equalsIgnoreCase(dstr));
        System.out.println(str);
        System.out.println(str.toLowerCase().toUpperCase().concat("hello"));

    }
}
