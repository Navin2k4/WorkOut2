public class RemoveDiplicateCharacter {
    public static void main(String[] args) {
        String str = "HellowelcometoJava";
        char[] strarr = str.toCharArray();
        String final_string ="";
        for (char x : strarr) {
            String y = x+"";
            if(!final_string.contains(y)){
                final_string+=y+"";
            }
        }
        System.out.println(final_string);
    }
}
