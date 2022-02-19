package Stage1_2;

/*Замена символов в словах по позиции (шаги программы):
 Прочитать с экрана консоли текст из нескольких слов различной длины (разделитель между словами один пробел);
 Прочитать с экрана консоли номер к-позиции символа в словах и новый символ для замены;
 В каждом слове введенного текста заменить k-ю букву на заданный символ.
Если k больше длины слова, слово пропускать.
* */

import java.util.Scanner;

public class CharReplacement {
    public static void charRepl(Scanner in) {
        System.out.print("Sentence: ");
        String[] list = in.nextLine().split(" ");
        System.out.print("String substitute: ");
        String str = in.nextLine();
        System.out.print("Index for replace: ");
        if (!in.hasNextInt()) {
            System.out.print("Index is not correct: " + in.nextLine());
            return;
        }
        int index = in.nextInt();
        StringBuilder res = new StringBuilder();
        StringBuilder temp;
        for (String s : list) {
            if (s.length() >= index) {
                temp = new StringBuilder(s + " ");
                temp.replace(index - 1, index, str);
                res.append(temp);
            } else {
                res.append(s);
                res.append(" ");
            }
        }
        System.out.println(res);
    }
}
