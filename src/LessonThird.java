import java.util.Arrays;

public class LessonThird {
    public static void main(String[] args) {

        //Задание 1
        int[] taskOneArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //создание целочисленного массива
        System.out.println(Arrays.toString(taskOneArr));
        replacingArr(taskOneArr);
        System.out.println(Arrays.toString(taskOneArr));

        // Задание 2

        int[] taskTwoArr = new int[100];  // Создание пустого целочисленного массива длиной 100
        completionArray(taskTwoArr);
        System.out.println(Arrays.toString(taskTwoArr));

        // Задание 3
        int[] taskThreeArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //создание целочисленного массива
        System.out.println(Arrays.toString(taskThreeArr));
        increaseElementArray(taskThreeArr);
        System.out.println(Arrays.toString(taskThreeArr));

        //Задание 4
        //Создаем квадратный двухмерный целочисленный массив
        int[][] taskFourArr = new int[4][4];
        diagonalArray(taskFourArr);

        //Задание 5
        //Создаем массив с примитивами при помощи метода returnArray
        int[] array = returnArray(5, 8);
        System.out.println(Arrays.toString(array));


    }

    public static void replacingArr(int[] numbers) {
        //считываем длину существующего масиива taskOneArr
        int size = numbers.length;
        //Заполняем массив
        for (int i = 0; i < size; i++) {
            //Заменяем 0 на 1, 1 на 0
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                if (numbers[i] == 1) {
                    numbers[i] = 0;
                }
            }
        }
    }

    public static void completionArray(int[] taskTwoArr) {
        //Запрашиваем размер созданного массива
        int size = taskTwoArr.length;
        //Заполняем массив элементами от 1 до 100
        for (int i = 0; i < size; i++) {
            taskTwoArr[i] = i + 1;
        }
    }

    public static void increaseElementArray(int[] taskThreeArr) {
        //Запрашиваем размер созданного массива
        int size = taskThreeArr.length;
        //Заполняем массив
        for (int i = 0; i < size; i++) {
            //Умножаем на 2 все элементы массива которые меньше 6
            if (taskThreeArr[i] < 6) {
                taskThreeArr[i] *= 2;
            }
        }

    }

    public static void diagonalArray(int[][] taskFourArr) {
        // Заполняем дыумерный массив
        //Заполняем строки
        for (int i = 0; i < taskFourArr.length; i++) {
            //Заполняем столбцы и инициируем дополнительнйю переменную "а" котрая считает ячейки с лева на право
            // и при увеличении "j" на еденицу уменьшатся на 1
            for (int j = 0, a = taskFourArr[i].length - 1; j < taskFourArr[i].length; j++, a--) {
                //Условия при выполнении которых в диагонали заполняются 1
                if (i == j || i == a) taskFourArr[i][j] = 1;
                System.out.print(taskFourArr[i][j] + " ");
            }
            System.out.println();

        }
    }


    public static int[] returnArray(int len, int initialValue) {
        //Создаем массив с примитивными данными
        int[] nums = new int[len];
        //Заполняем полученный массив
        for (int i = 0; i < len; i++) {
            nums[i] = initialValue;

        }
        return nums;//Возвращаем созданный массив в main
    }


}
