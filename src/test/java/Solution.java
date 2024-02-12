import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

       public static final Pattern EMAIL_ADDRESS_REGEX_VALID =
            Pattern.compile("^[A-Z._%+-]+@[A-Z.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean solution(String S) {
        int countOfAt = 0;
        int countOfFullStop = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '@')
                countOfAt++;
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '@')
                countOfFullStop++;
        }
        Matcher matcher = null;
        if (countOfAt == 1 && countOfFullStop == 1) {
            matcher = EMAIL_ADDRESS_REGEX_VALID.matcher(S);

        }

//        assert matcher != null;
        return matcher.find();

    }

    @Test
    public void test1() {
        System.out.println(solution("ttt@gmail.com"));

    }
}
