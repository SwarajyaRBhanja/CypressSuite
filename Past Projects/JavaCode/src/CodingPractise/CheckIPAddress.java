package CodingPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIPAddress {

    public static void main(String[] args) {

        //Check with Regex and pattern matcher

        /*Regex for digit 0-255
        \d represents digits in regular expression, same as [0-9]
        \\d{1,2} catches any one or two digit number
        (0|1)\\d{2} catches any three digit number starting with 0 or 1.
        2[0|4] --->number between 200 & 249
        25[0-5] ---->Number between 250 & 255

         */

        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        Pattern p = Pattern.compile(zeroTo255);
        Matcher m= p.matcher("234");
        System.out.println(m.matches());
    }
}
