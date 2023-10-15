public class WordContainingParticularNumber_27 {
    public static void main(String[] args) {
        String str = "hell01 hello1 hello2 hello2 hi1 hi2 word1 word2";
        String x = "1";
        String strarr[] = str.split(" ");
        int count = 0;
        for (String words : strarr) {
            if (words.contains(x)) {
                System.out.println(words);
                count++;
            }
        }
        System.out.println("Number of words containing with the character " + x + " is " + count);
    }
}