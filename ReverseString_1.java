public class ReverseString_1 {
    public static void main(String[] args) {
        String str = "hello";
        char strchr[] = str.toCharArray();
        String revstr = "";
        for(int i=str.length()-1;i>=0;i--){
            revstr += strchr[i];
        }
        System.out.println(revstr);
    }
}
