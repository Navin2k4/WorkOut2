public class Longest_29{
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with some words.";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest Word: " + longestWord);
    }
}
