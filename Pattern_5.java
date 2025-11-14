/*  
    *       * * * * *
    *       *
    *       *
    *       *
    * * * * * * * * *
            *       *
            *       *
            *       *
    * * * * *       * 
 */

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row (Note : number of row is Odd and >= 5) = ");
        int row = sc.nextInt();

        for (int i = 1; i <= (row+1)/2; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == (row+1)/2) {
                    System.out.print("* ");
                }

                else{
                    if((j==1 || j==(row+1)/2) || (i==1 && j>(row+1)/2)){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }

        for(int i=1 ; i<=row/2 ; i++){
            for(int j=1 ; j<=row ;j++){
                if((i==row/2 && j<(row+1)/2) || (j==row || j==(row+1)/2)){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}