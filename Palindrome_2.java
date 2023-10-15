public class Palindrome_2 {
    public static void main(String[] args) {
        String str = "malayalam";
        char strchr[] = str.toCharArray();
        String revstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr += strchr[i];
        }
        System.out.println(revstr);
        if(str.equalsIgnoreCase(revstr)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }

}
