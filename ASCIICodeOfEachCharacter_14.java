public class ASCIICodeOfEachCharacter_14 {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] strarr = str.toCharArray();
        String final_string = "";
        System.out.println(str);
        for (char x : strarr) {
            String y = x + "";
            if (!final_string.contains(y)) {
                final_string += y + "";
            }
        }
        char chararr[] = final_string.toCharArray();
        for(char y : chararr){
            System.out.println("Character : "+ y + " ASCII Code : " + (int)y);
        }

    }
}
