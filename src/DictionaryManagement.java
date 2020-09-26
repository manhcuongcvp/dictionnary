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

    /*public static void main(String[] args) {
        Dictionary a = new Dictionary();
        //insertFromCommandline(tmp);

        Scanner sc = new Scanner(System.in);
        a.SIZE = sc.nextInt();
        String tmp = sc.nextLine();;

        for (int i = 0; i < a.SIZE; i++) {
            String aa = sc.nextLine();
            String bb = sc.nextLine();
            a.setWord_array(aa, bb, i);
            //a.word_array[i].setWord_target(aa);
            //a.word_array[i].setWord_explain(bb);
            //System.out.println(i + " " + a.word_array[i].getWord_target() + " " + a.word_array[i].getWord_explain());
        }
    }*/
}
