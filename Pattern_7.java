/*
    4 4 4 4 4 4 4 
    4 3 3 3 3 3 4 
    4 3 2 2 2 3 4 
    4 3 2 1 2 3 4 
    4 3 2 2 2 3 4 
    4 3 3 3 3 3 4 
    4 4 4 4 4 4 4
 */

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Max number for pattern = ");
        int max_number = sc.nextInt();

        int[][] pattern_arr = new int[max_number*2-1][max_number*2-1];
        int n = 0;

        for(int i = 0 ; i<max_number;i++){
            n = max_number;
            for(int j = 0 ; j<max_number;j++){
                pattern_arr[i][j] = n;
                pattern_arr[i][max_number*2-2-j] = n;
                pattern_arr[max_number*2-2-i][j] = n;
                pattern_arr[max_number*2-2-i][max_number*2-2-j] = n;
                if(j<i){
                    n--;
                }
            }
        }

        for(int i =0 ;i<max_number*2-1;i++){
            for(int j= 0 ; j<max_number*2-1;j++){
                System.out.print(pattern_arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
