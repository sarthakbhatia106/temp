import java.io.*;
import java.util.*;

public class two {
    public static void main(String[] args) throws IOException {
        Scanner scn=new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int g = scn.nextInt();
            int p = scn.nextInt();

            int[] arr = new int[11];

            for (int i = 1; i <= 10; i++) {
                arr[i] = scn.nextInt();
            }

            int days = 0;
            for (int i = 10; i >g; i--) {
                sum += arr[i]/p;
                arr[i-1]=arr[i]%p;
            }
            System.out.println((days+1)+" "+(days+(arr[g]+p-1)/p));

           
        }
    }
}
