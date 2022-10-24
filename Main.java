
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        int d = Short.parseShort(num) + 10;
        double rand = Math.round(Math.random() * 40); // random number between 1-40
        double f = (d / rand);

        String percentage =  NumberFormat.getPercentInstance().format(f);

        System.out.println("Divisor: " + rand);
        System.out.println("Dividend: " + d);
        System.out.println("Result: " + f);
        System.out.println("Percent: " + percentage);

    }
}
