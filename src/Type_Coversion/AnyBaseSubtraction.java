package Type_Coversion;
import java.util.Scanner;
public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base value");
        int base = scn.nextInt();
        System.out.println("Enter the value");
        int n1 = scn.nextInt();
        System.out.println("Enter the Second Number");
        int n2 = scn.nextInt();
        int carry = 0;
        int ans = 0;
        int mul = 1;
        while(n1 > 0){
            int temp1 = n1%10;
            int temp2 = n2%10;
            temp1 = temp1+carry;
            int sub = 0;
            if(temp1 < temp2 || temp1 < 0){
                temp1 = temp1+base;
                carry = -1;
            }else{
                carry = 0;
            }
            sub = temp1-temp2;
            ans = ans+(sub*mul);
            mul = mul*10;
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println(ans);
    }
}
