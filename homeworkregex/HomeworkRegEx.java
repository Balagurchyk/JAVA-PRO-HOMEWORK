package com.proftelran.org.homeworkregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkRegEx {

    public static void main(String[] args) {
        //       Написать регулярные выражения для :
        //       Check phone number 7 digit, 7777777 or 777-7777 or  777 7777 :
        String s = "423-7829";
        Pattern pattern = Pattern.compile("\\d{3}[\\s-]?\\d{4}");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());


        //       E- Mail
        String sTwo = "vik-tor_1985@gmail.com";
        Pattern patternTwo = Pattern.compile("[\\w-]{3,}@[\\w-]+\\.[A-z]{2,}");
        Matcher matcherTwo = patternTwo.matcher(sTwo);
        System.out.println(matcherTwo.matches());

        //      Check password  8 letters, digit,letters and something else
        String sThree = "Qwerty123!";
        Pattern patternThree = Pattern.compile("[\\w~!@#$%^&*()\\-=+{\\[\\]}/.,]{8,}");
        Matcher matcherThree = patternThree.matcher(sThree);
        System.out.println(matcherThree.matches());
    }
}
