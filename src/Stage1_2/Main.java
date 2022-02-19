package Stage1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("First ex:" + Fibonachi.exerciceFibonacci(inputIn()));
        System.out.println("Second ex:");
        TextRewriter.textRewriter();
    }


    public static int inputIn() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str_in = in.nextLine();
        in.close();
        try {
            return Integer.parseInt(str_in);
        } catch (NumberFormatException e) {
            System.out.print("Введено не число, текст заменен на 0\n");
        }
        return 0;
    }
}
