package org.example;

import java.util.ArrayList;

public class CommonInTwoArrays {
    public static void main(String[] args){
       ArrayList<String> ar1 = new ArrayList<>();
       ar1.add("as");
       ar1.add("ad");
       ar1.add("ag");
       ArrayList<String> ar2 = new ArrayList<>();
       ar2.add("as");
       ar2.add("am");
       ar2.add("an");
       ar1.retainAll(ar2);
       System.out.println(ar1);

    }
}
