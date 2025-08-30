
    public class LongestWord {
        public static void main(String[] args) {
            String sentence = "Java is an object oriented programming language";

            String[] words = sentence.split(" ");  // split by space

            String longest = "";
            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            System.out.println("Sentence: " + sentence);
            System.out.println("Longest Word: " + longest);
            System.out.println("Length: " + longest.length());
        }
    }


