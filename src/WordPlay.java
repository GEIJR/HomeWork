import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordPlay {
    public static void main (String[] args) {
        guessingGame();
    }
        public static void guessingGame()
        {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println(Arrays.toString(words));

        Random myRandom = new Random();
        int hiddenWordIndex = myRandom.nextInt(words.length);
        String hiddenWord = words[hiddenWordIndex];
        System.out.println("Отгадайте задуманное слово");
        String guessedWord;
        Scanner myScanner = new Scanner(System.in);

            do { System.out.println("Введите слово");
              guessedWord = myScanner.nextLine();

                if (guessedWord.equals(hiddenWord))
                {
                    System.out.println("Вы угадали!");
                }
                else  {
                    System.out.println("Слово не угадано! Попробуйте еще раз!");

                   letterHint(hiddenWord, guessedWord);}

            }
            while  (!(hiddenWord.equals(guessedWord))) ;
        }
            public static void letterHint (String hiddenWord, String guessedWord ){
                String hint = "";
                for (int i = 0; i < 15; i++){
                    if (i >= guessedWord .length() || i >= hiddenWord.length()){
                        hint += "#";
                    } else if(guessedWord .charAt(i) == hiddenWord.charAt(i)){

                        hint += guessedWord .charAt(i);
                    } else
                        hint += "#";
                } System.out.println(hint);
    }
}
