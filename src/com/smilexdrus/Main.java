package com.smilexdrus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int int_var = 120;
        float float_var = 10.0F;
        boolean var_true = true;
        boolean var_false = false;
        String str = "Hello world!";

//        firstExercise(str);
//        secondExercise(int_var, float_var);
//        thirdExercise(var_true, var_false);
//        fourthExercise();
//        fifthExercise(str);
//        sixthExercise(str);
//        seventhExercise();
        eighthExercise();
//        System.out.println(ninthExercise());
    }

    public static void firstExercise(String str){
        System.out.println("First exercise:");
        System.out.println(str);
    }

    public static void secondExercise(int int_var, float float_var) {
        System.out.println("Second exercise:");

        System.out.println("+: " + (int_var + float_var));
        System.out.println("-: " + (int_var - float_var));
        System.out.println("/: " + (int_var / float_var));
        System.out.println("*: " + (int_var * float_var));

    }

    public static void thirdExercise(boolean var1, boolean var2) {
        System.out.println("Third exercise:");
        System.out.println("Логическое “не”(!): " + !var1);
        System.out.println("Логическое И(&): " + (var1 & var2));
        System.out.println("Логическое ИЛИ(OR): " + (var1 | var2));
        System.out.println("Логическое исключающее ИЛИ (XOR): " + (var1 ^ var2));
        System.out.println("Условное И(&&): " + (var2 && var1));
        System.out.println("Условное ИЛИ(||): " + (var2 || var1));
    }

    public static void fourthExercise() {
        System.out.println("Fourth exercise:");
        int[] intArray = new int[30];
        Random r = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = r.nextInt(10);
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(" " + intArray[i]);
        }
        System.out.println();
    }

    public static void fifthExercise(String str) {
        System.out.println("Fifth exercise:");
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar);
            System.out.print(" " + (int) aChar + "; ");
        }
    }

    public static void sixthExercise(String str) {
        System.out.println("\nSixth exercise:");
        Map<Character, Integer> dict_1 = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            char charAt = str.charAt(i);
            if (!dict_1.containsKey(charAt)) {
                dict_1.put(charAt, 1);
            } else {
                dict_1.put(charAt, dict_1.get(charAt) + 1);
            }
        }
        for (Map.Entry<Character, Integer> item : dict_1.entrySet()) {
            String key = String.valueOf(item.getKey());
            int count_char = item.getValue();
            if (count_char > 1) {
                System.out.println(key + ' ' + item.getValue());
            }
        }
    }

    public static void seventhExercise() {
        System.out.println("\nSeventh exercise:");
        for (int i = 100; i > 1; i--) {
            if (i % 10 == 1) {
                System.out.println(i + " бутылка стояла на столе, одна из них упала и разбилась.");
            } else if (i % 10 >= 2 && i % 10 <= 4 && (i % 100 < 10 || i % 100 >= 20)) {
                System.out.println(i + " бутылки стояли на столе, одна из них упала и разбилась.");
            } else {
                System.out.println(i + " бутылок стояло на столе, одна из них упала и разбилась.");
            }
        }
        System.out.println("1 бутылка стояла на столе, она упала и разбилась.");
    }

    public static void eighthExercise() {
        System.out.println("\nEighth exercise:");
        String expr = input_in();
//        String expr = "10*3+7+10/2";
        String expr_new = Simple_calculator.putSpaceAfterSymbol(expr, ',');
        Simple_calculator calculator = new Simple_calculator(expr_new);
        System.out.println(expr + "=" + calculator.calculate());
    }

    public static Boolean ninthExercise() {
        String string = input_in();
        System.out.println("\nTenth exercise:");
        string = string.replaceAll(" ", "").toLowerCase();
        String reversedString = reverseString(string);
        return string.equals(reversedString);
    }
    public static String reverseString(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) r.append(s.charAt(i));
        return r.toString();
    }
    public static String input_in() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str_in = in.nextLine();
        in.close();
        return  str_in;
    }
}

