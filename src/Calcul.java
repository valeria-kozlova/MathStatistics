/*особо не нужно*/
package matStatistics;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        int count = 0;
        double b = 20;
        while (count != 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("a: ");
            int a = scanner.nextInt();

            double sum = 0;
            sum = (a - b) * (a - b) ;
           // System.out.println(sum);
            double sum1 = 0;
            sum1 = sum/b;
            System.out.printf("%.4f", sum1);
            count++;
            System.out.println(" ");
        }

    }
}
