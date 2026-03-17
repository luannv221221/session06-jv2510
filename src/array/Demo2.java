package array;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int[] arr = {1,4,6,8,9,0,2};
        // Nhap vao mot so nguyen n tu ban phim kiem tra xem phan tu co nam trong mang hay khong
        System.out.println("Moi nhap vao so nguyen ");
        int n = Integer.parseInt(sc.nextLine());

        // Linear search
        boolean isSearched = false;
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                isSearched = true;
                break;
            }
        }
        if(isSearched){
            System.out.println("Co tim thay trong mang");
        } else {
            System.out.println("Khong tim thay trong mang");
        }
           */
        // Binary Search
        int[] arr2 = {1,3,5,7,9,12,16};
        System.out.println("Nhap vao gia tri can tim");
        int value = Integer.parseInt(sc.nextLine());
        int left = 0;
        int right = arr2.length-1;
        boolean flag = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr2[mid] == value) {
                flag = true;
                break;
            }
            if (arr2[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if(flag){
            System.out.println("Tim tthay gia tri");
        } else {
            System.out.println("Khong tim tthay gia tri");
        }

        // Sap xep mang  int[] arr = {1,4,6,8,9,0,2}; giam dan theo thuat toan exchange sort (Sap xep hoan doi)
        int[] arr = {1,4,6,8,9,0,2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sap xep giam dan");
       for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sap xep tang dan");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
