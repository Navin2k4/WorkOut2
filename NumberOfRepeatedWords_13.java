public class NumberOfRepeatedWords_13 {
    public static void main(String[] args) {
        String str = "hello oreo hello and tilo made good product";
        String x = "hello"; 
        String strarr[] = str.split(" ");
        int count = 0;
        for (String words : strarr) {
            if(words.endsWith(x)){
                count++;
            }
        }
        System.out.println("Number of words with the word "+ x + " is "+count);
    }
}
