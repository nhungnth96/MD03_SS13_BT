package bt04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("nhập vào 1 số: ");
        int num = new Scanner(System.in).nextInt();
        int i = linearSearch(arr, num);
        if(i==1){
            System.out.println("không tìm thấy");
        } else {
            System.out.println(num+"ở vị trí "+i);
        }
    }
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return 1;
    }
}
