public class FirstCharOfEachWord_22 {
    public static void main(String[] args) {
        String str = "Hello World";
        String strarr[] = str.split(" ");
        String final_string = "";
        for (String words : strarr) {
            String sub = words.substring(0, 1);
            final_string += sub;
        }
        System.out.println("First characters of each word in a sentence : " + final_string);
    }
}
