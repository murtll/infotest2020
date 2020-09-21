package com.murtll.infotest;

import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int maxCount = 0;
        Map<Byte, Integer> schoolNumbersCounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            scan.next();
            scan.next();
            byte school = scan.nextByte();

            if (schoolNumbersCounts.containsKey(school)) {
                schoolNumbersCounts.put(school, schoolNumbersCounts.get(school) + 1);
                maxCount = Math.max(maxCount, schoolNumbersCounts.get(school));
            }
            else schoolNumbersCounts.put(school, 0);

        }

        int finalMaxCount = maxCount;
        schoolNumbersCounts.forEach((school, count) -> { if (count == finalMaxCount) System.out.println(school);});

    }
}
