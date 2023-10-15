public class RemoveDigit_12 {
    
    public static void main(String[] args) {
        String str = "Hello 123hi to Java";
        char[] strarr = str.toCharArray();
        String final_string = "";
        for (char x : strarr) {
            if (!Character.isDigit(x)) {
                final_string += x + "";
            }
        }
        System.out.println(final_string);
    }
}
