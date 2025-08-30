public class OnlyDigit {
        public static void main(String[] args) {
            String str1 = "123456";
            String str2 = "12a45";

            System.out.println(str1 + " → " + isOnlyDigits(str1));
            System.out.println(str2 + " → " + isOnlyDigits(str2));
        }

        public static boolean isOnlyDigits(String str) {
            if (str == null || str.isEmpty()) return false;

            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

}
