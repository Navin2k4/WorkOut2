public class ChangeTwoStrings_8 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Before Swap: " + str1 + " " + str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("After Swap: " + str1 + " " + str2);
    }
}
