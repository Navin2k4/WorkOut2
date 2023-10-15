public class Delete_34 {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        String removed = removeWord(sentence, "sample");
        System.out.println(removed);
    }

    public static String removeWord(String sentence, String wordToRemove) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
