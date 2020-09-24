import java.util. Scanner;

public class DictionaryManagement {
    Dictionary a = new Dictionary();

    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        a.SIZE = sc.nextInt();
        for (int i = 0; i < a.SIZE; i++) {
            String Word_target = sc.nextLine();
            String Word_explain = sc.nextLine();
            a.word_array[i].setWord_target(Word_target);
            a.word_array[i].setWord_explain(Word_explain);
        }
    }
}
