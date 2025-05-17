package Tipedata;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
      String[] arrayString;
      arrayString = new String[3];
      arrayString[0] = "Bambang";
      arrayString[1] = "Sugiarto";
      arrayString[2] = "Bams";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "03"; // Nilai yang berbeda
        System.out.println(arrayString[0]);

        String[] stringArray = new String[3];

        String[] namaNama = {
                "Dan", "Satulagi","Sebagainya"
        };

        int[]  arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L,20L,30,40L
        };

        System.out.println(arrayLong.length); //length untuk menghitung panjang sebuah nilai

        String[][] members = {
                {"Bambang" , "Sugiarto"},
                {"Betari" , "Vesya"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][1]);



    }
}
