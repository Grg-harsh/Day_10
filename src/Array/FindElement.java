package Array;
import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Size of  array");
        int n = scn.nextInt();
        System.out.println("Element od Array");
        int arr[] = new int[n];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println("Element to findout");
        int d = scn.nextInt();
        int ans = findElement(arr,d);
        System.out.println(ans);
    }
    public static int findElement(int arr[],int d){
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx]==d){
                return idx;
            }
        }
        return -1;

    }
}
