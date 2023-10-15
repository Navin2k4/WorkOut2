import java.util.StringTokenizer;

public class NoOfWords_5 {
    public static void main(String[] args) {
        String string = "Hello welcome to Jave Programming";
        StringTokenizer st = new StringTokenizer(string);
        System.out.println("Number of Words : " + st.countTokens());
        while(st.hasMoreTokens()){
            //System.out.println(st.nextToken());
        }
    }
}
