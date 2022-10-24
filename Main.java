
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String num = input.next();
        float d = Float.parseFloat(num) + 10;
        double rand = Math.round(Math.random() * 40); // random number between 1-40
        double f = (d / rand);

        String percentage =  NumberFormat.getPercentInstance().format(f);

        System.out.println("Divisor: " + rand);
        System.out.println("Dividend: " + d);
        System.out.println("Result: " + f);
        System.out.println("Percent: " + percentage);

    }
}
