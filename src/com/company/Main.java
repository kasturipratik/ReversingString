package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // reversing a string
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = scan.nextLine();
        String reverse = "";

        // length of the string - one gives the last index of a string :::: get the index last string index to 0;
        for(int i = name.length()-1;i >=0;i-- ) {

            reverse = reverse + name.charAt(i);
        }

      System.out.println("Reverse String\n"+reverse);

        // reversing an array
        String listOfName[] = {"Kabin","Pratik","Diwakar","Ujwal"};

        for(int i = listOfName.length -1; i >=0;i--){

            System.out.println(listOfName[i]);

        }



    }


}
