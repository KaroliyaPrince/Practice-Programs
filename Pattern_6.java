/*
    1  2  3  4  5 
    10 9  8  7  6 
    11 12 13 14 15 
    20 19 18 17 16 
    21 22 23 24 25
 */

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row = ");
        int row = sc.nextInt();
        int n = 1;


        for(int i=1; i<=row; i++){
            for(int j = 1 ; j<=row;j++){
                if(i%2==0){
                    System.out.print(n+" ");
                    n--;
                }
                else{
                    System.out.print(n+" ");
                    n++;
                }
            }
            if(i%2!=0){
                n+=row-1;
            }
            else n+=row+1;
            System.out.println();
        }
    }
}
