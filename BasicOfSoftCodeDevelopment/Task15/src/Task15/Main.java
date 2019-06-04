package Task15;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long summa = 1;
        double result;
        for(int i = 1;i <= 200;i++) {
            result = Math.pow(i,2);
            summa *= result;
        }
        System.out.println(summa);

    }
}
