package com.viscontti.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String arg[]){
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Montevideo");
        placesToVisit.add("Punta del Este");
        placesToVisit.add("Pan de Azúcar");
        placesToVisit.add("Piriápolis");
        placesToVisit.add("Piria de nuevo!");
        placesToVisit.add("Maldonado");

        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> list){
        Iterator iterator = list.iterator();
    /*    for (int i = list.size()-1 ; i >= 0; i--){
            System.out.println(list.get(i));
        }*/

        while (iterator.hasNext()){
            System.out.println("Now visiting... " + iterator.next());
        }

        System.out.println("=====================================");
    }


}
