package bt05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {27,40,57,82,96};
        System.out.println("Nhập vào 1 số: ");
        int num = new Scanner(System.in).nextInt();
        int i = binarySearch(arr,num);;
        if(i==-1){
            System.out.println("không tìm thấy");
        } else {
            System.out.println(num+" ở vị trí "+i);
        }
    }
    public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length-1;
        while(high>low){
            int mid = (low + high) / 2;
            if(num<arr[mid]){
                high = mid -1;
            } else if (num == arr[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
