package com.viscontti.practice;

public class Practice003 {
    private static int initNumber = 4;
    private static int finishNumber = 20;
    private static int numbersFound = 0;
    private static int sumTotal = 0;

    public static void main(String[] args){
        Practice003 p003 = new Practice003(4, 20);
    }


    public Practice003(int init, int fin){
        initNumber = init;
        finishNumber = fin;
        while (initNumber <= finishNumber){
            initNumber++;
            if (!(isEven(initNumber))){
                continue;
            }
            numbersFound++;
            sumTotal+= initNumber;
            System.out.println("Even number: " + initNumber);

        }

        System.out.println("Cantidad de números encontrados: " + numbersFound);
        System.out.println("Suma total: " + sumTotal);
    }


    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }

}
