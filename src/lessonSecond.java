public class lessonSecond {
    public static void main(String[] args) {
        //Переменные к первому зазанию
        int x = 10;
        int y = 5;
        witch10and20(x, y);
        //Переменные ко второму заданию
        int q = -3;
        positiveNegative(q);

        // переменные к третьему заданию
        //вариант 1
        int w = 5;
        moreTheZeroOne(w);
        System.out.println(moreTheZeroOne(w));
        //вариант 2
        int r = -3;
        moreTheZeroTwo(r);
        System.out.println(moreTheZeroTwo(r));

        //переменные к 4 заданию
        printString("Новая строка", 5);
// переменные к пятому заданию
        int u = 10;
        leapYear(u);
        System.out.println(leapYear(u));
    }

    //Задание 1
    public static boolean witch10and20(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
            return true;
        } else
            System.out.println("false");
        return false;
    }

    //Задание 2
    public static void positiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное!");
        } else if (a < 0) {
            System.out.println("Число отрицательное!");
        }
    }

    //Задание 3
    //1 вариант
    public static boolean moreTheZeroOne(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //2 варианат (честно найден в интернете)
    public static boolean moreTheZeroTwo(int a) {
        return (a < 0);

    }
// Задание 4

    public static void printString(String Text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(Text);
        }
    }

    //Задание 5
    public static boolean leapYear(int a) {
        if ((a % 400 == 0)||(a % 4  == 0 )){
            return true;
        } else
        if (a % 100 == 0) {
            return false;
        }
        else return false;

    }
}
