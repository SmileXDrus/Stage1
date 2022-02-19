package Stage1_2;

/*Прочитать с экрана консоли произвольный текст, содержащий не только буквы,
но цифры и другие символы. Удалить из введенного текста все символы,
кроме пробелов, не являющиеся буквами.
Подсказка1: Регулярка А-Я а-я не включает в себя буквы Ёё
Подсказка2: Можно сделать так.
Создать свой алфавит из русских букв. Пусть это будет массив
char[]  alphabet = {'а','б','в','г','д'}; //продолжить
и с ним работать, что буквы слов принадлежать словарю иначе удалять.
Или воспользоваться Character.isLetter(char)  / Character.isAlphabetic(char)
Дока: https://metanit.com/java/tutorial/7.4.php
* */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextRewriter {
    public static void  textRewriter(String sentence) {
        StringBuilder output = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-ZА-Яа-я-Ёё\\s*]");
        Matcher matcher = pattern.matcher(sentence);
        while(matcher.find()) {
            output.append(matcher.group());
        }
        System.out.println(output);
    }

}
