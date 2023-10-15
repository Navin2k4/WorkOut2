public class CountLowerCase_16 {
    
    public static void main(String[] args) {
        String str = "Hello World Welcomes You";
        char strchr[] = str.toCharArray();
        int lowercaseCount = 0;
        for (char x : strchr) {
            if (Character.isLowerCase(x)) {
                lowercaseCount++;
            }
        }
        System.out.println("Lowercase count : " + lowercaseCount);
    }
}
