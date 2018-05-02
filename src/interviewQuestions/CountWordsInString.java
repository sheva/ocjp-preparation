package interviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsInString {

    public static void main(String... args) {
        String str = "I love sushi, really";
        System.out.println(str.split("[^a-zA-Z]+"));
//        System.out.println(str.split("([^a-zA-Z']+)'*\\1*"));

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
        System.out.println(pattern.matcher(str).find());

    }
}
