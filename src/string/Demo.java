package string;

public class Demo {
    public static void main(String[] args) {
        // String literl ngytenthuy
       String str1 = "Rikkei";
       String str2 = "Rikkei";
       // Spring Object - Reference
       String str3 = new String("Rikkei");
       String str4 = new String("Rikkei");

       // so sach gia yti chuoi
        System.out.println("So sanh voi equals so sanh gia tri");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str3.equals(str4)); // true

        // so sanh voi ==
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); // false
    }
}
