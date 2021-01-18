package leetcode202;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class HappyNumber {
    public static  boolean isHappy(int n) {
        Set<Integer> numberSet = new HashSet<>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                int rem = current % 10;
                sum = sum + (rem * rem);
                current = current / 10;
            }
            if (numberSet.contains(sum)) {
                return false;
            }
            n = sum;
            numberSet.add(n);
        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        int n;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = s1.nextInt();
        System.out.println(h.isHappy(n));

    }
}
