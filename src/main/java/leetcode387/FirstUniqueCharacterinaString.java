package leetcode387;

import java.util.Scanner;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[] value = new int[26];
        for(int i = 0; i<s.length(); i++){
            value[s.charAt(i)-'a']++;
        }
        for(int j = 0; j<s.length(); j++){
            if(value[s.charAt(j)-'a']==1) return j;
        }
        return -1;

    }
    public static void main(String[] args) {
        FirstUniqueCharacterinaString f = new FirstUniqueCharacterinaString();
        String s;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input a string: ");
        s = s1.nextLine();
        int result = f.firstUniqChar(s);
        System.out.println(result);
    }
}
