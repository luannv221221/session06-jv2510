package array;

public class Demo1 {
    public static void main(String[] args) {
        // Khai bao mang
        // DataType[] arrayName = new DataType[5];
        int[] arrayInt = new int[5];
        String[] arrayString = {"Nguyen van A","Nguyen van B","Nguyen van C","Nguyen van D"};

        // truy cap phan tu cua mang thong qua chi muc
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;
        System.out.println("Gia tri cua phan tu thu 2 trong mang ArrayString  = "+arrayString[1]);

        // duyet qua cac phan tu cua mang
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        // mang 2 chieu
        // int[][] array2 = new int[3][4];
        int[][] arrayInt2 = {{10,5,7,9},{5,3,1,3},{5,6,7,2}};
        System.out.println(arrayInt2[0][0]);
        System.out.println(arrayInt2[0][1]);
        System.out.println(arrayInt2[0][2]);
        System.out.println(arrayInt2[0][3]);
        System.out.println(arrayInt2[1][2]);

        // duyet mang 2 chieu
        for (int i = 0; i < arrayInt2.length; i++) {
           for (int j = 0; j < arrayInt2[i].length; j++) {
               System.out.printf("%d \t",arrayInt2[i][j]);
           }
            System.out.println("");
        }
    }
}
