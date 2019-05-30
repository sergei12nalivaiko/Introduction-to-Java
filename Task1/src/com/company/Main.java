package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите значение переменной а= ") ;
        a=sc.nextFloat();
        System.out.println("Введите значение переменной b= ") ;
        b=sc.nextFloat();
        System.out.println("Введите значен2ие переменной c= ") ;
        c=sc.nextFloat();
        float z=((a-3) * b / 2) + c;
        System.out.println(z);
    }
}
