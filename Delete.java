public class Delete {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        String removed = sentence.replaceAll("\\b(sample)\\b", "");
        System.out.println(removed);
    }
}
