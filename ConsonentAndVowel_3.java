public class ConsonentAndVowel_3 {
    public static void main(String[] args) {
        String str = "hello";
        char strchr[] = str.toCharArray();
        int consonents= 0 ;
        int vowels = 0 ;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(isVowel(strchr[i])){
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println(str);
        System.out.println("Vowels : " + vowels +" Consonents : "+consonents);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
