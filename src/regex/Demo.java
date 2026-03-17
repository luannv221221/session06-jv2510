package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        // nhap vao ma sinh vien gom 5 ky tu bat dau la SV 3 ky tu dang sau la so
        String studentCodeRegex = "SV[0-9]{3}";
        String studentCode = "SV010";
        Pattern pattern = Pattern.compile(studentCodeRegex); // tao ra 1 chuoi de so khop
        Matcher matcher = pattern.matcher(studentCodeRegex); // so khop voi chuoi dau vao
        boolean result = matcher.matches(); // tien hanh so khop va tra ve ket qua
        System.out.println(result);
        // cach su dung gop 3 buoc tren
        System.out.println(Pattern.matches(studentCodeRegex, studentCode));
    }
}
