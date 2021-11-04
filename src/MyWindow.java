import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MyWindow extends JFrame {
    public void initWindow(){

        setSize(500, 500);
        setLocation(650,250);

        int value = WindowConstants.EXIT_ON_CLOSE;
        setDefaultCloseOperation(value);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton firstButton = new JButton( "Вход");
        JButton secondButton = new JButton("Выход");
        JButton thirdButton = new JButton( "Какое слово загадал компьютер");
        panel.add(firstButton);
        panel.add(secondButton);
        panel.add(thirdButton);
        add(thirdButton, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        setVisible(true);
        JTextField textField = new JTextField();



    }

//
//    public static void WriteWord() {
//        String word;
//
//        Scanner myScanner = new Scanner( System.in);{
//            word = myScanner.nextLine();
//        }
//    }
//
//
//    System.out.println("Отгадайте задуманное компьютером слово");
//    int wjrds =  myScanner.nextInt();

}
