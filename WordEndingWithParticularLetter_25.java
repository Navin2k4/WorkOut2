public class WordEndingWithParticularLetter_25 {
    public static void main(String[] args) {
        String str = "hello orlo hello and tilo made good product";
        String x = "lo";
        String strarr[] = str.split(" ");
        int count = 0;
        for (String words : strarr) {
            if (words.endsWith(x)) {
                System.out.println(words);
                count++;
            }
        }
        System.out.println("Number of words ends with the character " + x + " is " + count);
    }
}
