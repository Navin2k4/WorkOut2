public class ReverseTheCase_19 {
    public static void main(String[] args) {
        String string = "Hello World";
        char strarr[] = string.toCharArray();
        String final_string ="";
        for(char x : strarr){
            if(Character.isUpperCase(x)){
                char change = Character.toLowerCase(x);
                final_string+=change+"";
            }
            if(Character.isLowerCase(x)){
                char change = Character.toUpperCase(x);
                final_string+=change+"";
            }
        }
        System.out.println(final_string);
    }
}
