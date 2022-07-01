import java.util.Random;

public class Task2 {

    //»спользу€ датчик случайных чисел, заполнить массив из двадцати элементов неповтор€ющимис€ числами.
    // ¬ывести полученные массивы на экран.
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random r = new Random();

        for(int i = 0; i<20; i++){
            numbers[i] = r.nextInt();
            System.out.println(numbers[i]);
        }

        System.out.println();

        for(int i = 0; i<20; i++){
            for(int j = i+1; j<20; j++){
                if (numbers[i] == numbers[j]){
                    numbers[j] = r.nextInt();
                };
            }
        }

        for(int i = 0; i<20; i++){
            System.out.println(numbers[i]);
        }

    }
}
