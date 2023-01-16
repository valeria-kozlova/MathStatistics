/*
Бросить игральный кубик 120 раз, записать результат.
Построить статистический ряд,
выборочную функцию распределения, вычислить выборочное среднее, выборочную дисперсию,
а также исправленную выборочную дисперсию.
*/
package matStatistics;

public class Task1 {
    public static void main(String[] args) {
        int n = 120;
        int[] array = new int[n];
        int i = 0;
        double sum = 0;
        int unitCounter = 0; int deucesCounter = 0; int tripletsCounter = 0;
        int foursCounter = 0; int fivesCounter = 0; int sixesCounter = 0;
        System.out.print("Сгенерированные числа: ");
        while (i < array.length) {
            array[i] = (int) Math.round((Math.random() * 5) + 1);
            if (i % 10 == 0) {
                System.out.println(" ");
            }
            System.out.print(" " + array[i]);
            sum += array[i];
            if (array[i] == 1) {unitCounter +=1;} if (array[i] == 2) {deucesCounter +=1;}
            if (array[i] == 3) {tripletsCounter +=1;} if (array[i] == 4) {foursCounter +=1;}
            if (array[i] == 5) {fivesCounter +=1;} if (array[i] == 6) {sixesCounter +=1;}
            i++;
        }
        System.out.println('\n' + "Статистический ряд: ");
        System.out.println("1: " + unitCounter + "/" + n + '\n' + "2: " + deucesCounter + "/" + n
                + '\n' + "3: " + tripletsCounter + "/" + n + '\n' + "4: " + foursCounter + "/" + n
                + '\n' + "5: " + fivesCounter + "/" + n + '\n' + "6: " + sixesCounter + "/" + n);
        double srzn = sum / n;
        System.out.printf("Выборочное среднее Х с чертой: " + "%.2f", srzn);
        double dispersiya = 0;
        double dispers = 0;
        double disp = 0;
        for (int k : array) {
            disp = (k - srzn) * (k - srzn);
            //System.out.printf('\n' + " сумма разностей " + "%.2f", skv);
            dispers += disp;
        }
       // System.out.printf('\n' + "поделить осталось: " + "%.2f", skvd);
        dispersiya = dispers / n;
        System.out.printf('\n' + "Выборочная дисперсия S в квадрате : " + "%.2f", dispersiya);
        double skvadrVkv = (double) (n * dispersiya) / (n - 1);
        System.out.printf('\n' + "Исправленная выборочная дисперсия S^ с волной в квадрате: " + "%.2f", skvadrVkv);
    }
}




























