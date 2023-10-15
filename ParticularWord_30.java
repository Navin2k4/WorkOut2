public class ParticularWord_30 {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        String targetWord = "sample";
        boolean found = sentence.contains(targetWord);
        if (found) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found.");
        }
    }
}
