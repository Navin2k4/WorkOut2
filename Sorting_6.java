public class Sorting_6 {
    public static void main(String[] args) {
        String inputString = "banana apple orange grape";
        String sortedString = sortWords(inputString);
        System.out.println(sortedString);
    }

    public static String sortWords(String input) {
        String[] words = input.split(" ");
        int n = words.length;
        
        // Bubble sort
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (words[j].compareTo(words[j+1]) > 0) {
                    // Swap words[j] and words[j+1]
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

        // Join the sorted words back into a string
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sortedString.append(words[i]);
            if (i < n-1) sortedString.append(" ");
        }

        return sortedString.toString();
    }
}
