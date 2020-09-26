import java.util.ArrayList;

public class Dictionary {
    ArrayList<Word> arr = new ArrayList<Word>();

    public void addWord(Word w) {
        arr.add(w);
    }

    public Word getWord(int i) {
        return arr.get(i);
    }
}