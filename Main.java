package com.viscontti.practice;

public class Main {

    public static void main(String[] args) {
        int numerosEncontrados = 0;
        for (int i = 2; i < 25; i++){
            if (esNumeroPrimo(i)){
                System.out.println("Numero primo: " + i);
                numerosEncontrados++;
                if (numerosEncontrados == 3){
                    break;
                }
            }
        }
    }

    private static boolean esNumeroPrimo(int n){

        if (n == 1){
            return false;
        }

        for (int i = 2 ; i <= n/2 ; i++){
            if (n % i == 0){
               return false;
            }

        }

        return true;
    }

}
