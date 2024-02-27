import groovyjarjarantlr.preprocessor.PreprocessorLexer;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexpTasks {

    public static void main(String[] args) {
        System.out.println(validateForDuplicates("Тhis is is a test"));
    }

    public static boolean isTrueCat(String input) {
        if (input == null) {
            return false;
        }
        Pattern p = Pattern.compile(
                "cat",
                Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE
        );
        Matcher m = p.matcher(input);
        return m.find();
    }

    public static int catculator(String input) {
        if (input == null) {
            return 0;
        }
        Pattern p = Pattern.compile(
                "(\\d)* cat(|s)",
                Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE
        );
        Matcher m = p.matcher(input);
        int num = 0;
        while (m.find()) {
            if (m.group(1) == null) {
                num += 1;
            } else {
                num += Integer.parseInt(m.group(1));
            }
        }
        return num;
    }

    public static String skynet(String input) {
        if (input == null) {
            return "";
        }
        return input.replaceAll("\\bhuman\\b", "computer");
    }


    public static String removeDuplicates(String input) {
        if (input == null) {
            return "";
        }
        return input.replaceAll("(\\w)\\1+", "$1");
    }

    public static boolean isEmail(String input) {
        if (input == null) {
            return false;
        }
        return input.matches("[0-9a-zA-Z]+\\.{0,1}[0-9a-zA-Z]+@[a-z]+\\.[a-z]{2,3}");
    }

    public static String validateForDuplicates(String input) {
        if (input == null) {
            return "";
        }
        return input.replaceAll("(\\b\\S+\\b)(\\s+)(\\1\\b)", "$1$2<strong>$3</strong>");
    }
}