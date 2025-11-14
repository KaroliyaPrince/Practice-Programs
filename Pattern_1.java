/*
    1 
    2   6 
    3   7   10 
    4   8   11  13 
    5   9   12  14   15 
 */

import java.util.Scanner;

public class Pattern_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row = ");
        int row = sc.nextInt();

        int temp = 0;

        for(int i = 1 ; i<=row ;i++){
            temp = i;
            for(int j=1 ; j<=i ;j++){
                System.out.print(temp+" ");
                temp = temp + (row-j);
            }
            System.out.println();
        }

    }
}