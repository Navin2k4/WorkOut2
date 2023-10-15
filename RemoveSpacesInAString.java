public class RemoveSpacesInAString {
    public static void main(String[] args) {
        String string = " This Sentence has too   much spaces       ";
        System.out.println(string.replaceAll(" ",""));
    }
}
