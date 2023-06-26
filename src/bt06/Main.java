package bt06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập vào 1 số: ");
        int num = new Scanner(System.in).nextInt();
        int i = binarySearch(arr,num);;
        if(i==-1){
            System.out.println("không tìm thấy");
        } else {
            System.out.println(num+" ở vị trí "+i);
        }
    }
    public static int binarySearch(Integer[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
