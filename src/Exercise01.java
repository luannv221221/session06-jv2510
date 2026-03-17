import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khao bao mang chua diem sv
        float[] marks = new float[1000];
        // khai bao va khoi tao chi so phan tu nho nhat chua luu tru diem
        int currentIndex = 0;
        do {
            System.out.println("******************QUẢN LÝ ĐIỂM SV****************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên ");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất ");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt ");
            System.out.println("6. Sắp xếp điểm tăng dần ");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoat");
            System.out.println("Chhopn 1 - 8");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Ban muon nhap diem cho bao nhieu sinh vien ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap vao diem sinh vien :");
                        marks[i] =  Float.parseFloat(sc.nextLine());
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.println("Danh sach diem sv : ");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.printf("%.1f \t", marks[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    float sumMarks = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        sumMarks += marks[i];
                    }
                    System.out.println("Diem TB cua sv : "+(sumMarks/currentIndex));
                    break;
                case 4:
                    float min = marks[0];
                    float max = marks[0];
                    for (int i = 0; i < currentIndex; i++) {
                        if(min > marks[i]){
                            min = marks[i];
                        }
                        if(max < marks[i]){
                            max = marks[i];
                        }
                    }
                    System.out.printf("Diem Cao nhat : %.1f - Diem Thap Nhat: %.1f \n",max,min);
                    break;
                case 5:
                    int countPass = 0;
                    int countFail = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if(marks[i] >= 5){
                            countPass++;
                        } else {
                            countFail++;
                        }
                    }
                    System.out.printf("So luong sinh vien dat : %d - So luong SV truot :%d",countPass,countFail);
                    break;
                case 6:
                    for (int i = 0; i < currentIndex - 1; i++) {
                        for (int j = i + 1; j < currentIndex; j++) {
                            if(marks[i] > marks[j]){
                                float temp = marks[i];
                                marks[i] = marks[j];
                                marks[j] = temp;
                            }
                        }
                    }
                    System.out.println("Da sap xep diem tang dan ");
                    break;
                case 7:
                    int countExcellent = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if(marks[i] >= 8){
                            countExcellent++;
                        }
                    }
                    System.out.printf("So luong sinh vien gioi : "+countExcellent);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Chon sai lua chon vui long chon lai");
            }
        } while (true);

    }
}
