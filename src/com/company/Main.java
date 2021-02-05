package com.company;

public class Main {

    public static void main(String[] args) {
	int age, temp;
        System.out.println(method(45,10));
        System.out.println(method(20, -10));
        System.out.println(method(10, 0));
        System.out.println(method(40, 15));
        System.out.println(method(35, -0));

    }
    public static String method(int age, int temp){
        if (age > 20 && age < 45 && temp >-20 && temp < 30){
           return "Можно идти гулять";
        }
        else if (age < 20 && temp > 0 && temp < 20){
            return "можно идти гулять";
        }
        else if (age > 45 && temp >-10 && temp < 25){
            return "Можно идти гулять";
        }
        else{
            return "Оставайтесь дома";
        }
    }
}
