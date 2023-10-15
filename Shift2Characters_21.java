public class Shift2Characters_21 {
    public static void main(String[] args) {
        String message = "Hello World";
        int shift = 2;
        String encodedMessage = encode(message, shift);
        System.out.println("Encoded Message: " + encodedMessage);
    }

    public static String encode(String message, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
