public class CapitalizeFirstLetter_9 {
    public static void main(String[] args) {
        String original_string = "hello world";
        String final_string = original_string.substring(0,1).toUpperCase()+original_string.substring(1);
        System.out.println(final_string);
    }
}
