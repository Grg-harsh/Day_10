package Array;
import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        int maximum = max(arr);
        System.out.println(maximum);
        for(int idx = maximum; idx >= 1; idx--){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= idx){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static int max(int arr[]){
        int max = arr[0];
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] > max){
                max = arr[idx];
            }
        }
        return max;
    }
}
