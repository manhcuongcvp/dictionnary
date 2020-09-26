import java.util.Scanner;

public class DictionaryManagement {
    //Dictionary a = new Dictionary();

    public static void insertFromCommandline(Dictionary a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String Word_target = sc.nextLine();
            String Word_explain = sc.nextLine();
            Word w = new Word(Word_target, Word_explain);
            a.addWord(w);
        }

        sc.close();
    }
}