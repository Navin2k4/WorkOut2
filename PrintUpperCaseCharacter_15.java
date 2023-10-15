public class PrintUpperCaseCharacter_15 {
    public static void main(String[] args) {
        String str = "Hello World Welcomes You";
        char strchr[] = str.toCharArray();
        String uppercase = "" ;
        for(char x : strchr){
            if(Character.isUpperCase(x)){
                uppercase+= x+"" ;
            }
        }
        System.out.println("Uppercase letters : " + uppercase);
    }
}
