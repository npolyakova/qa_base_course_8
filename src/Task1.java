import java.util.Scanner;

public class Task1 {
    //Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе выполнения программы.

    public static void main(String[] args) {
        int[] numbers = new int[10]; //0 1 2 3 4 5 6 7 8 9
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
