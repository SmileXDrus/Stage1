package Stage1_2;

import Stage1_2.TranslatorToModelClass.Sentence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Input string: ");
//        System.out.println("First ex:" + Fibonachi.exerciceFibonacci(convertToInt(in.nextLine())));
//        System.out.print("Second ex:");
//        TextRewriter.textRewriter(in.nextLine());
//        System.out.println("Third ex: ");
//        CharReplacement.charRepl(in);
//        MaxMinWords.getMaxMinList(in.nextLine());
        Sentence sentence = new Sentence(in.nextLine().split(" "));
//        System.out.println(sentence.getWordByPosition(0).getOriginalWord());
//        System.out.println(sentence.getWordByPosition(0).getSymbolsCount());
//        System.out.println(sentence.getWordsCount());
        System.out.println("Модель создана!");
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
