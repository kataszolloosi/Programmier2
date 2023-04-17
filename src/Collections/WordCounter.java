package Collections;

import java.util.HashMap;

public class WordCounter {
    //attribute
    private String text;
    private HashMap<String, Integer> wordCount = new HashMap<>();

    //konstruktor
    public WordCounter(String text) {
        this.text = text;
    }

    public void convertTextToMap() {
        removePunctuation();
        System.out.println(text);
        //wörter zählen
        String[] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            //wenn das wort ist noch nicht gibt
            if (wordCount.get(splitText[i]) == null) {
                wordCount.put(splitText[i], 0);
            }
            wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
        }
    }

    //satzzeichen entfernen
    private void removePunctuation() {
//        text = text.replaceAll("[^a-zA-Z0-9\\\\s]", "");
//        System.out.println(text);

        String newText = " ";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || Character.isLetter(text.charAt(i))) {
                newText += text.charAt(i);
            }
        }
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }

    public void setWordCount(HashMap<String, Integer> wordCount) {
        this.wordCount = wordCount;
    }
}
