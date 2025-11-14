/*
    1 
    1 2 1 
    1 * 3 * 1 
    1 * * 4 * * 1 
    1 * * * 5 * * * 1 
    1 * * * * 6 * * * * 1
 */

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row = ");
        int row = sc.nextInt();

        for(int i = 1 ; i<=row ;i++){
            for(int j = 1 ;j<=i*2-1 ; j++){
                if(j==1 || j==i*2-1){
                    System.out.print("1 ");
                }
                else if(j==i){
                    System.out.print(i+" ");
                }
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
