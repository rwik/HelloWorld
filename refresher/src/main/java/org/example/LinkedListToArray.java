package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {
    public static void main (String[] args){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("R");
        ll.add("W");
        ll.add("I");
        ll.add("K");
        System.out.println("LinkedList content : " + ll);
        String[] ar = ll.toArray(new String[0]);
        System.out.println("Array1 content : " + Arrays.toString(ar));
        


    }
}
