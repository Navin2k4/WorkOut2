public class SwapFirstAndLast_36 {
    public static void main(String[] args) {
        String string = "Hello There";
        char x = string.charAt(0);
        char y = string.charAt(string.length() - 1);
        String final_string = "";
        final_string += y+string.substring(1, string.length()-1)+x;
        System.out.println(final_string);
    }
}
