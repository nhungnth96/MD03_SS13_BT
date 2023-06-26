package bt01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    }

