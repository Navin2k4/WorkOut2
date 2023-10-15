public class NumberofEndingLetterCount_32 {
    public static void main(String[] args) {
        String str = "hello oreo hello and tilo made good product";
        String x = "o"; 
        String strarr[] = str.split(" ");
        int count = 0;
        for (String words : strarr) {
            if(words.endsWith(x)){
                count++;
            }
        }
        System.out.println("Number of words ends with the character "+ x + " is "+count);
    }
}
