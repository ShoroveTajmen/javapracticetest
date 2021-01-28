package leetcode3;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(b_pointer<s.length()){
            if(!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(set.size(),max);
            }
            else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }

        }
        return max;

    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        String s;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = s1.nextLine();
        int final_result = l.lengthOfLongestSubstring(s);
        System.out.println(final_result);
    }
}
