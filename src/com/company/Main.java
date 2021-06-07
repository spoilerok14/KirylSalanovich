package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Введите число ");
	int number = sc.nextInt();

	if(number > 7){
		System.out.print("Привет");
	}
	else{
		System.out.print("Нужно число побольше");
	}
    }
}