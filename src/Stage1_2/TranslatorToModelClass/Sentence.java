package Stage1_2.TranslatorToModelClass;

/*  1) в качестве поля класса (переменной экземпляра) должен содержать массив классов “Word”;
    2) конструктор в качестве аргумента должен принимать массив String[] слов исходного предложения;
    данный массив надо преобразовать в массив “Word” и присвоить полю класса.
    3) Снабдить класс “Sentence” public методом, который возвращает количество слов в предложении.
    4) Снабдить класс “Sentence” public методом, который возвращает экземпляр класса “Word”
    из массива слов аргумента класса по его позиции в предложении.
    5)Снабдить класс “Sentence” public методом, который воссоздает исходное предложение из массива слов Word[].*/

public class Sentence {
    private final Word[] words;

    public Sentence(String[] words) {
        this.words = new Word[words.length];
        for(int i =0; i < words.length; i++) {
            this.words[i] = new Word(words[i]);
        }
    }

    public int getWordsCount() {
        return words.length;
    }

    public Word getWordByPosition(int pos) {
        return words[pos];
    }

    public String getOriginalSentence() {
        StringBuilder sb = new StringBuilder();
        for (Word w : words)
            sb.append(w.getOriginalWord());
        return sb.toString();
    }
}
