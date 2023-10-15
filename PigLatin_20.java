public class PigLatin_20 {
    public static void main(String[] args) {
        String str = "hello";
        String firstLetter = str.substring(0, 1);
        String restOfWord = str.substring(1);
        String pigLatin = restOfWord + firstLetter + "ay";
        System.out.println(pigLatin);
    }
}
