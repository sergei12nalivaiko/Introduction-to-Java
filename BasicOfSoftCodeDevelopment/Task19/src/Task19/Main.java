package Task19;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a= ");
        Integer a = sc.nextInt();
        System.out.print("Введите число b= ");
        Integer b = sc.nextInt();
        ArrayList<Character> intA = new ArrayList<>();
        ArrayList<Character> intB = new ArrayList<>();

        for(Character c: a.toString().toCharArray()) {
            intA.add(c);
        }

        System.out.println("В состав числа a  входят следующие цифры: ");
        for(Character c: intA) {
            System.out.println(c);
        }
        for(Character c: b.toString().toCharArray()) {
            intB.add(c);
        }
        System.out.println("В состав числа b  входят следующие цифры: ");
        for(Character c: intB) {
            System.out.println(c);
        }
    }
}
