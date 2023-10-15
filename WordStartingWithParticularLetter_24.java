public class WordStartingWithParticularLetter_24 {
    public static void main(String[] args) {
        String str = "hello orlo hello and tilo hede good product";
        String x = "he";
        String strarr[] = str.split(" ");
        int count = 0;
        for (String words : strarr) {
            if (words.startsWith(x)) {
                System.out.println(words);
                count++;
            }
        }
        System.out.println("Number of words ends with the character " + x + " is " + count);
    }
}
