package com.viscontti.practice;

public class OddNumber {
    private static int sum;

    public static void main(String[] args){
        isOdd(37);
        System.out.println("--------------");
        sumOdd(11, 99);

    }


    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        if (number % 2 == 0){
            return false;
        }

        return true;
    }

    public static int sumOdd(int start,
                             int end){
        if (!(end >= start) && !(start >= 0)){
            return -1;
        }
        for (int i = start; start <= end;
             start++){
            if (!(start % 2 == 0)){
                sum += start;
                System.out.println("Found number: " +
                        "" + start);
            }
        }

        System.out.println("sum: " + sum);
        return sum;
    }
}
