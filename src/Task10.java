import java.util.Random;

public class Task10 {

    //��� ��������� ������. ����������:
    //����� ���� ��������� ������� ������ �������
    //����� ���� ��������� ������� ������� �������
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        Random r = new Random();

        for (int i = 0; i<numbers.length; i++){
            for (int j = 0; j<numbers[0].length; j++){
                numbers[i][j] = r.nextInt(5);
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i<numbers[2].length; i++){
            sum1 += numbers[2][i];
        }

        for (int i = 0; i<3; i++){
            sum2 += numbers[i][1];
        }

        System.out.println("����� ���� ��������� ������� ������ ������� " + sum1);
        System.out.println("����� ���� ��������� ������� ������� ������� " + sum2);
    }
}
