import java.util.*;
public class pattern6 {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int nst=n/2+1;
        int nsp=1;
        for (int i = 0; i < n; i++) {
            for (int j=0;j<nst;j++){
                System.out.print("*\t");
            }
            for (int k=0;k<nsp;k++){
                System.out.print("\t");
            }
            for (int j=0;j<nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if (i<n/2) {
                nst--;
                nsp+=2;
            } else {
                nst++;
                nsp-=2;
            }
        }

     }
    
}
