import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int  n= scn.nextInt();
        int nst =1;
        for (int i=0;i<n;i++){
            for (int j=0;j<nst;j++){
                System.out.print("*\t");

            }
            System.out.println();
            nst++;
        }

    }
}
