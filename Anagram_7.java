import java.util.Arrays;

public class Anagram_7 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isAnagram = Arrays.equals(charArray1, charArray2);
        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
