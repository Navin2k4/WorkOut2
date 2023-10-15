public class WordContainingParticularLetter_26 {
    public static void main(String[] args) {
        String str = "hello hello made good product";
        String x = "lo";
        String strarr[] = str.split(" ");
        int count = 0;
        for (String words : strarr) {
            if (words.contains(x)) {
                System.out.println(words);
                count++;
            }
        }
        System.out.println("Number of words having with the character " + x + " is " + count);
    }
}
