public class OnlyAlphabatic_10 {
    public static void main(String[] args) {
        String str = "Hello welcome to Java";
        //String str = "Hello welcome to 123 Java";
        char[] strarr =str.toCharArray();
        boolean passed = true;
        for(char x : strarr){
            if(!Character.isAlphabetic(x)){
                passed = false;
                break;
            }
        }
        if(passed){System.out.println("The String is valid");}
        else{System.out.println("The string is not valid");}
    }
}
