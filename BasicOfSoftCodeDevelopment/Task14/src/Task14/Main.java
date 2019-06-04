package Task14;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double summa = 0;
        double result;
        for(int i = 1;i <= 100;i++) {
            result = Math.pow(i,2);
            summa += result;
        }
        System.out.println(summa);
    }
}
