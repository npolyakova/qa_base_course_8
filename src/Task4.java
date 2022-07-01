import java.util.Random;
import java.util.Scanner;

public class Task4 {

    //Дан массив. Все его элементы:
    //увеличить в 2 раза
    //уменьшить на число А
    //разделить на первый элемент.
    public static void main(String[] args) {
        double[] numbers = new double[5];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = r.nextInt(10);
            System.out.println(numbers[i]);
        }

        System.out.println();

        for(int i = 0; i<numbers.length; i++){
            numbers[i] *= 2;
            numbers[i] -= a; //numbers[i] = numbers[i] - a
            numbers[i] /= numbers[0];
            System.out.println(numbers[i]);
        }
    }
}
