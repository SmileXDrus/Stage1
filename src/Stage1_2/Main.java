package Stage1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        System.out.println("First ex:" + Fibonachi.exerciceFibonacci(convertToInt(in.nextLine())));
        System.out.print("Second ex:");
        TextRewriter.textRewriter(in.nextLine());

        in.close();
    }

    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.print("Введено не число\n");
        }
        return -1;
    }
}
