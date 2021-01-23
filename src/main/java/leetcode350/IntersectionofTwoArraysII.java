package leetcode350;

import java.util.*;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0,j=0;
    Arrays.sort(nums1);
    Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
              i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[list.size()];
        int k =0;
        for(int i1 : list){
            result[k++] = i1;
        }
        return result;

    }
    public static void main(String[] args) {
        IntersectionofTwoArraysII i1 = new IntersectionofTwoArraysII();
        int n;
        int array1[] = new int[10];
        int array2[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();


        System.out.println("Enter the elements of the array1: ");
        for(int i=0; i<n; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int j=0; j<n; j++){
            System.out.println(array1[j]);
        }


        int n1;
        System.out.println("Enter element: ");
        n1 = sc.nextInt();

        System.out.println("Enter the elements of the array2: ");
        for(int j=0; j<n1; j++){
            array2[j] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int k=0; k<n1; k++){
            System.out.println(array2[k]);
        }

        int[] Final_result = i1.intersect(array1,array2);
        System.out.println(Arrays.toString(Final_result));
    }
}
