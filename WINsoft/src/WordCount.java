import java.util.HashMap;

public class WordCount {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = str.split("\\s+");
        
        for (String word : words) {
           
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return wordCountMap;
    }

    public static void main(String[] args) {
        String str = "Hello! How are you? This is a simple program to count words in a string. Isn't it interesting?";

        HashMap<String, Integer> wordCountMap = countWords(str);
        
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
