package bt07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Bonjour");
        strings.add("Ohayou");
        strings.add("Xin chào");
        strings.add("Nihao");
        System.out.println("nhập vào chuỗi: ");
        String greeting = new Scanner(System.in).nextLine();
        boolean check = false;
        for (int i = 0; i < strings.size(); i++) {
            if (greeting.equals(strings.get(i))) {
                System.out.println(greeting + " ở vị trí " + i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        }
    }

}
