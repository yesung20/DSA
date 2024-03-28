package com.CodingTest;
import java.util.Scanner;

public class bj_1213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] cnt = new int[200];
        int flag = 0;
        char mid = 0;
        StringBuilder ret = new StringBuilder();

        for (char a : s.toCharArray())
            cnt[a]++;

        for (int i = 'Z'; i >= 'A'; i--) {
            if (cnt[i] > 0) {
                if ((cnt[i] & 1) == 1) {
                    mid = (char) i;
                    flag++;
                    cnt[i]--;
                }
                if (flag == 2)
                    break;
                for (int j = 0; j < cnt[i]; j += 2) {
                    ret.insert(0, (char) i);
                    ret.append((char) i);
                }
            }
        }

        if (mid != 0)
            ret.insert(ret.length() / 2, mid);

        if (flag == 2)
            System.out.println("I'm Sorry Hansoo");
        else
            System.out.println(ret);
    }
}
