import java.util.StringTokenizer;

public class CountWords_31 {
    public static void main(String[] args) {
        String string = "Hello my name is AAAA";
        StringTokenizer st = new StringTokenizer(string);
        System.out.println("Number of Words : " + st.countTokens());
    }
}
