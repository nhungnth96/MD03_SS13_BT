package bt03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số: ");
        int num = new Scanner(System.in).nextInt();
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();
        boolean check = false;
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                if (arr[i][j] == num) {
                    colList.add(i);
                    rowList.add(j);
                    check = true;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        if (check) {
            for (int k = 0; k < rowList.size(); k++) {
                int row = rowList.get(k)+1;
                int col = colList.get(k)+1;
                System.out.println("số "+num+" nằm ở cột "+col+", hàng "+row);
            }
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
