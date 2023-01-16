/*
По своему варианту выборок объёма 80.
Сформировать группированный статистический ряд с 8 интервалами,
построить гистограмму и по группир.стат.ряду найти оценки мат.ожидания и дисперсии.
*/
package matStatistics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> mylist = new ArrayList<Double>();
        while (scanner.hasNextDouble()) {
            double i = scanner.nextDouble();
            mylist.add(i);
        }
        //просто вывод содержимого листа
       /* for (Double aDouble : mylist) {
            System.out.println(aDouble);
        }*/
        Collections.sort(mylist);
        int count = 0;
        for (Double aDouble : mylist) {
            System.out.print(aDouble + " | ");
            count++;
            if (count % 9 == 0) {
                System.out.println(" ");
            }
        }
        double min = mylist.get(0);
        double max = mylist.get(mylist.size() - 1);
        System.out.println('\n' + "Наименьшее число: " + min + '\n' + "Наибольшее число: " + max);
        int numberOfIntervals = 8;
        System.out.println("Найдем 8 интервалов: ");

        double step = (max - min) / numberOfIntervals;
        int countNew = 0;
        double interval = min;
        double sr = 0;
        while (countNew != 8) { sr = (interval + (interval+step))/2;
            System.out.print( '\n' + "[");
            System.out.printf("%.4f", interval);
            System.out.print("; ");
            interval += step;
            System.out.printf("%.4f", interval);
            System.out.println(")");
            System.out.print("среднее значение: " );
            System.out.printf("%.4f", sr);
            countNew++;

        }
    }
}
