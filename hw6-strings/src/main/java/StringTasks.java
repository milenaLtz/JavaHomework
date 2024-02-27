import java.util.Arrays;

public class StringTasks {
    public static void main(String[] args) {
        System.out.println(isStrictPalindrome("A nut for a jar of tuna", false));
    }

    public static boolean isLowerCase(String input) {
        if (input == null || input.isEmpty() == true) {
            return false;
        }
        char[] array = input.toCharArray();
        for (char i : array) {
            if (!Character.isLowerCase(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUpperCase(String input) {
        if (input == null || input.isEmpty() == true) {
            return false;
        }
        char[] array = input.toCharArray();
        for (char i : array) {
            if (!Character.isUpperCase(i)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isCamelCase(String input) {
        if (input == null || input.isEmpty() == true) {
            return false;
        }
        if (Character.isUpperCase(input.charAt(0))) {
            for (int i = 1; i < input.length(); i++) {
                if (!Character.isLowerCase(input.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isMixedCase(String input) {
        if (input == null || input.isEmpty() == true) {
            return false;
        }
        char[] array = input.toCharArray();
        double count = 0;
        for (char i : array) {
            if (Character.isLowerCase(i)) {
                count++;
            }
        }
        double len = array.length;
        return count == len / 2;

    }

//    public static boolean isPalindrome(String input) {
//        if (input == null || input.isEmpty() == true) {
//            return false;
//        }
//        char[] array = input.toLowerCase().replaceAll("\\W", "").toCharArray();
//        for (int i = 0; i < input.length() / 2; i++) {
//            if (array[i] != array[array.length - i - 1]) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean isPalindrome(String input) {
//        if (input == null || input.isEmpty() == true) {
//            return false;
//        }
//        input = input.toLowerCase().replace(" ", "").replace(",", "").replace(".", "");
//        for (int i = 0; i < input.length() / 2; i++) {
//            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty() == true) {
            return false;
        }
        input = input.toLowerCase();
        int lp = 0;
        int rp = input.length() - 1;
        char i, j;
        while (lp < rp) {
            i = input.charAt(lp);
            j = input.charAt(rp);
            if (Character.isAlphabetic(i) && Character.isAlphabetic(j) || !Character.isAlphabetic(i) && !Character.isAlphabetic(j)) {
                rp--;
                lp++;
                if (Character.isAlphabetic(i) != Character.isAlphabetic(j)) {
                    return false;
                }
            } else if (!Character.isAlphabetic(i)) {
                lp++;
            } else {
                rp--;
            }
        }
        return true;
    }


    public static boolean isStrictPalindrome(String input, boolean isStrict) {
        if (isStrict == false) {
            return isPalindrome(input);
        } else if (isStrict) {
            if (input == null || input.isEmpty() == true) {
                return false;
            }
            input = input.replaceAll("\\s", "");
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isAllCharactersPaired(String input) {
        if (input == null || input.isEmpty() == true) {
            return false;
        }
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (!(array[i * 2] == array[i * 2 + 1])) {
                return false;
            }
        }
        return true;
    }

    public static String replaceBinaryNumbers(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                sb.append("1");
            } else if (input.charAt(i) == '1') {
                sb.append("0");
            } else {
                sb.append(input.charAt(i));
            }
        }
        String str = sb.toString();
        return str;
    }

    public static String replace(String input, char from, char to) {
        if (input == null) {
            return null;
        }
        return input.replace(from, to);
    }


    public static String makeDragonCurve(int n) {
        StringBuilder sb = new StringBuilder("R");
        for (int i = 0; i < n; i++) {
            String s = sb.toString();
            sb.append("R");
            String str = s.replace("R", "l");
            String str2 = str.replace("L", "R");
            String str3 = str2.replace("l", "L");
            sb.append(new StringBuilder(str3).reverse());
        }
        return sb.toString();
    }

    public static String makeGrayCode(int n) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 1; i < n + 1; i++) {
            String s2 = sb.toString();
            sb.append(" ").append(i).append(" ").append(s2);
        }
        return sb.toString();
    }

}
