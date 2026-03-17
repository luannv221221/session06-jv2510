import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = "";
        String email = "";
        String phone = "";
        String password = "";

        do {
            System.out.println("******************QUẢN LÝ NGƯỜI DÙNG****************");
            System.out.println("1. Nhap thong tin nguoi dung ");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le ");
            System.out.println("6. Thoat ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin nguoi dung ");
                    System.out.println("Nhap vao ho va ten");
                    fullName = sc.nextLine();
                    System.out.println("Nhap vao email ");
                    email = sc.nextLine();
                    System.out.println("Nhap vao phone ");
                    phone = sc.nextLine();
                    System.out.println("Nhap vao password ");
                    password = sc.nextLine();
                    break;
                case 2:
                    fullName = fullName.trim().replaceAll("\\s+"," ");
                    String [] fullNameArr = fullName.split(" ");
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < fullNameArr.length; i++) {
                        stringBuilder.append(Character.toUpperCase(fullNameArr[i].charAt(0)))
                                .append(fullNameArr[i].substring(1).toLowerCase()).append(" ");

                    }
                    fullName = stringBuilder.toString().trim();
                    System.out.println("Ten sau khi chuan hoa "+fullName);
                    break;
                case 3:
                    // demo@rikei.edu.vn demo@gmail.com
                    String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
                    if(Pattern.matches(regexEmail, email)){
                        System.out.println("Email Hop le");
                    } else {
                        System.err.println("Email Khong hop le");
                    }
                    break;
                case 4:
                    String regexPhone = "^(03|05|09|01)\\d{8}$";
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Lua chon sai roi");
            }
        } while (true);
    }
}
