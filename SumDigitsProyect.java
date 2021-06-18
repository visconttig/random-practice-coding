package com.viscontti.practice;
// ALT + 124
public class SumDigitsProyect {
    private static int sum = 0;


    public static int sumDigits(int number){
        if ((number <= 9)){
            return -1;
        }

        return sum;
    }

    public static void main (String[] args){
        System.out.println("Resultado: " + sumDigits(3));
        System.out.println("Resultado: " + sumDigits(-11));
        System.out.println("Resultado: " + sumDigits(10));
    }
}
