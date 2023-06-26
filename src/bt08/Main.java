package bt08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập min: ");
        int min = new Scanner(System.in).nextInt();
        System.out.println("Nhập max: ");
        int max = new Scanner(System.in).nextInt();
        List<Integer> foundedList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (min<arr[i]&& arr[i]<max){
                foundedList.add(arr[i]);
            }
        }
        System.out.println("tìm thấy "+foundedList.size()+" số: "+foundedList);
    }
}
