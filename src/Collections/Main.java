package Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Welt";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String str2 = "Hallo Welt der die, das Hallo - 1 : Hallo";
        WordCounter wordCount = new WordCounter(str2);
        wordCount.convertTextToMap();
        System.out.println(wordCount.getWordCount());

        Player p1 = new Player("Kata");


    }

}
