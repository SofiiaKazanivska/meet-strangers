package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {

        Scanner x = new Scanner(System.in);
        int count_strangers = x.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= count_strangers; i++) {
            String s = x.nextLine();
            list.add(s);
        }

        for (int i = 1; i < list.size(); i++) {
            int n = list.size() - i - 1;
            System.out.println("Hello, " + list.get(i));
        }

        if (count_strangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        if (count_strangers < 0) {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
