package com.kar.steps.Programs.String;

import org.junit.Assert;
import org.junit.Test;

public class AddSpaceIfCapLetter {

    public String AddSpacesToSentence(String input) {
        String output = input.replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2");
        return output;
    }

    public String AddSpacesToSentence1(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(sb.charAt(i));
            if (i > 0 && Character.isUpperCase(c)) {
                sb.append(' ');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    @Test
    public void testText() {
        AddSpacesToSentence("HelloWorld");
        String expected = "Hello World";
//        Assert.assertEquals(AddSpacesToSentence("HelloWorld"), expected);
        Assert.assertEquals(AddSpacesToSentence1("HelloWorld"), expected);

    }


//    This regex searches for a lowercase letter follwed by an uppercase letter and replaces them with the former, a space and the latter (effectively separating them with a space). It puts each of them in a capturing group () in order to be able to re-use the values in the replacement string via back references ($1 and $2).
//
//    To find upper- and lowercase letters it uses \p{Ll} and \p{Lu} (instead of [a-z] and [A-Z]), because it handles all upper- and lowercase letters in the Unicode standard and not just the ones in the ASCII range (this nice explanation of Unicode in regexes mostly applies to Java as well).
}
