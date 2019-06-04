package Task4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите действительное число r вида nnn.ddd= ") ;
        float r = sc.nextFloat();
        float r1 = ((int)((r % 1) * 1000)) + ((float)((int)r) / 1000);
        System.out.println(r1);
    }
}
