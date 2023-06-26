package bt09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập min: ");
        int min = new Scanner(System.in).nextInt();
        System.out.println("Nhập max: ");
        int max = new Scanner(System.in).nextInt();
        int min2 = 0;
        int indexMin2 = 0;
        int max2 = 0;
        int indexMax2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min && arr[i] > min2 ) {
                min2 = arr[i];
                indexMin2 = i;
            }
            if (arr[i] > min && arr[i] < max && arr[i]> max2) {
                max2 = arr[i];
                indexMax2 = i;
            }

        }
        System.out.println("Số bé hơn gần min nhất: "+min2+" ở vị trí "+indexMin2);
        System.out.println("Số bé hơn gần max nhất: "+max2+" ở vị trí "+indexMax2);
    }
    }


