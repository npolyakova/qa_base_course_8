public class Task8 {

    //Дан двумерный массив.
    //1. Вывести на экран элемент, расположенный в правом верхнем углу массива
    //2. Вывести на экран элемент, расположенный в левом нижнем углу массива

    // (0,0) (0,1)
    // (1,0) (1,1)

    public static void main(String[] args) {
        String[][] things = new String[][]{
            {"table" ,"hat", "pancake", "apple"},
            {"pear", "pencil", "stick", "pen"},
                {"a", "b", "c", "d"}
        };

        int indexRight = things[0].length-1;
        int indexLeft = things.length-1;
        System.out.println(things[0][indexRight]);
        System.out.println(things[indexLeft][0]);

    }
}
