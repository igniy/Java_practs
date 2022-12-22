package mirea.newpract13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

    String formattedPhone;

    public Phone(String phone) {
        if (phone.charAt(0) != '+') {
            phone = "+7" + phone.substring(1);
        }

        String regex = "(\\+\\d+)(\\d{3})(\\d{3})(\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        matcher.find();

        formattedPhone =
                new StringBuffer()
                        .append(matcher.group(1))
                        .append(matcher.group(2))
                        .append('-')
                        .append(matcher.group(3))
                        .append('-')
                        .append(matcher.group(4))
                        .toString();
    }
    public static void main(String[] args) {
        System.out.println(new Phone("+71234567890").formattedPhone);
        System.out.println(new Phone("81234567890").formattedPhone);
        System.out.println(new Phone("+101234567890").formattedPhone);
    }
}
