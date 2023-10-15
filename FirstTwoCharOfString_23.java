public class FirstTwoCharOfString_23 {
    public static void main(String[] args) {
        String str = "Hello World";
        String strarr[] = str.split(" ");
        String final_string = "";
        for (String words : strarr) {
            String sub = words.substring(0,2);
                final_string+=sub;
            }
        System.out.println("First 2 characters of each word in a sentence " + final_string);
    } 
}