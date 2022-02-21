package Stage1_2;

/*Прочитать с экрана консоли текст из любого количество слов.
Найти и вывести на экран все слова максимальной и все слова минимальной длины.*/

public class MaxMinWords {
    public static void getMaxMinList(String sentence) {
        String[] list = sentence.replaceAll("\\s+", " ").split(" ");
        int max = list[0].length();
        int min = max;
        for (String item : list) {
            int length = item.length();
            if (length > max) max = length;
            if (length < min) min = length;
        }
        getListWordsEqualCount(max, list);
        getListWordsEqualCount(min, list);
        System.out.println("Max " + max + ": " + getListWordsEqualCount(max, list) + "\nMin " + min + ": " + getListWordsEqualCount(min, list));
    }
    private static String getListWordsEqualCount(int count, String[] list){
        StringBuilder countStr = new StringBuilder();
        for (String item : list) {
            if (item.length() == count) countStr.append(item).append(", ");
        }
        return  countStr.toString();
    }
}
