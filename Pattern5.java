import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int nsp=n/2;
        int nst=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<nsp;j++){
                System.out.print("\t");

            }
            for (int k=0;k<nst;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if  (i<n/2) {
                nst+=2;
                nsp--;
            } else {
                nst-=2;
                nsp++;
                
            }

            }
        }
    }

