package com.viscontti.practice;

public class EvenNumber {


    public static void main(String[] args){
        System.out.println("Is even: " + isEven(180));
    }


    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
}
