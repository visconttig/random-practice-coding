package com.viscontti.practice;

public class UdemyPractice002 {
    private static int encontrados;
    private static int sum;

    public static void main(String[] args){
        for (int i = 1; i <= 1000 ; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                sum += i;
                encontrados++;
                System.out.println("Numero encontrado: " + i);
                System.out.println("Suma: " + sum);
            }
            if (encontrados == 5){
                break;
            }

        }
    }

}
