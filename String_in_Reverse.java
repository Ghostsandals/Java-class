
public class String_in_Reverse {


public static void stringInReverse() {
        String phrase = "The quick brown fox jumps over the lazy dog";
        char[] letters = phrase.toCharArray();
        for(int i = letters.length - 1; i >= 0; i--) {
                        System.out.print(letters[i]);
        }
        }
}

