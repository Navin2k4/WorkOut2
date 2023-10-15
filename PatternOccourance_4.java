public class PatternOccourance_4 {
        public static void main(String[] args) {
            String inputString = "ababababab";
            String pattern = "ab";
            int count = 0;
            int index = 0;
            while ((index = inputString.indexOf(pattern, index)) != -1) {
                count++;
                index += pattern.length();
            }
            System.out.println("Number of occurrences: " + count);
        }
    }