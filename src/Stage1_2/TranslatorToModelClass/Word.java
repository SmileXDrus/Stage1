package Stage1_2.TranslatorToModelClass;

/*  1) в качестве поля класса (переменной экземпляра) должен содержать массив символов слова char[];
    2) конструктор в качестве аргумента должен принимать слово String исходного предложения;
    слово надо преобразовать в массив char[] и присвоить полю класса.
    3) Снабдить класс “Word” public методом, который возвращает количество символов в слове.
    4) Снабдить класс “Word” public методом, который воссоздает слово в виде String из массива char[].*/

public class Word {
    private final char[] word;

    public Word(String word) {
        this.word = word.toCharArray();
    }

    public int getSymbolsCount() {
        return word.length;
    }

    public String getOriginalWord() {
        StringBuilder sb = new StringBuilder(word.length);
        for (Character c : word)
            sb.append(c.charValue());
        return sb.toString();
    }
}
