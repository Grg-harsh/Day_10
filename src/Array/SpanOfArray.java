package Array;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        int ans = span(arr);
        System.out.println(ans);
    }
    public static int span(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int idx = 0; idx < arr.length; idx++){
            if(min >= arr[idx]){
                min = arr[idx];
            }
        }

        int max = Integer.MIN_VALUE;
        for(int idx = 0; idx < arr.length; idx++){
            if(max <= arr[idx]){
                max = arr[idx];
            }
        }

        return max-min;
    }
}
