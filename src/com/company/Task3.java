package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[200];
        for(int i = 0; i < mas.length; i++){
            mas[i] = i + 1;
        }
       for(int a : mas){
           if(a%3 == 0){
               System.out.print(a+" ");
           }
       }
    }
}
