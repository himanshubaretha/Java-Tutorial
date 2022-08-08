import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nsp=0;
        int nst=n;
        for (int i=0;i<n;i++){
            for(int j=0;j<nsp;j++){
                System.out.print("\t");

            }
            for (int k=0;k<nst;k++){
                System.out.print("*\t");
            }
            System.out.println();
            nsp++;
            nst--;
        }
    }
}
