package bt11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double[] arr = {1.5, 3.5, 4.8, 9.6, 10.2};
        System.out.println("nhập vào 1 số: ");
        Double num = new Scanner(System.in).nextDouble();
        int i = linearSearch(arr, num);
        if(i==1){
            System.out.println("không tìm thấy");
        } else {
            System.out.println(num+" ở vị trí "+i);
        }
    }
    public static int linearSearch(Double[] arr, Double num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(num)) {
                return i;
            }
        }
        return 1;
    }

    }

