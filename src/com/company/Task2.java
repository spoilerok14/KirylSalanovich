package com.company;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String realName = "Вячеслав";

        System.out.print("Введите имя ");
        String name = sc.nextLine();

        if(name.equals(realName)) {
            System.out.print("Привет, Вячеслав");
        }
        else{
          System.out.print("Мы ждем другого человека");
        }


    }
}
