package leetcode242;
import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] counter = new int[26];
        for(int i = 0; i<s.length(); i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int j=0; j<counter.length; j++){
            if(counter[j] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();

        String s1,s2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        s1 = s.nextLine();
        System.out.println("Enter your second string: ");
        s2 = s.nextLine();

        System.out.println(v.isAnagram(s1,s2));
    }
}
