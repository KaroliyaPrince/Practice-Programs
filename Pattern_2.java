/*
    * * * * * * *
      *       *
        *   *
          *
        *   *
      *       *
    * * * * * * *      
 */

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row = ");
        int row = sc.nextInt();

        for(int i = 1 ;i<=row-3 ; i++){
            for(int j = 1 ; j<=row;j++){
                if(i==1){
                    System.out.print("* ");
                }
                else{
                    if(j==i || j==row-i+1){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
                
            }
            System.err.println();
        }

        for(int i=row-2 ; i<=row ; i++){
            for(int j = 1 ;j<=row ;j++){
                if(i==row){
                    System.out.print("* ");
                }
                else{
                    if(j==row-i+1 || j==i){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
