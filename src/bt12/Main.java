package bt12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double[] arr = new Double[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập vào 1 số: ");
        Double num = new Scanner(System.in).nextDouble();
        int i = binarySearch(arr,num);;
        if(i==-1){
            System.out.println("không tìm thấy");
        } else {
            System.out.println(num+" ở vị trí "+i);
        }
    }
    public static int binarySearch(Double[] arr, Double key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid].equals(key)) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
