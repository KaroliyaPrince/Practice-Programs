/*
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1 
 */

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row = ");
        int row = sc.nextInt();

        int[][] pattern_arr = new int[row][row];

        for(int i=0 ; i<row ;i++){
            for(int j=0;j<row;j++){
                pattern_arr[i][j] = 0;
            }
        }

        for(int i=0 ; i<row ;i++){
            for(int j=0 ;j<=i;j++){
                if(j==0 || j==i){
                    pattern_arr[i][j] = 1;
                }
                else{
                    pattern_arr[i][j] = pattern_arr[i-1][j-1] + pattern_arr[i-1][j];
                }
            }
        }

        for(int i= 0 ; i<row ;i++){
            for(int k=0 ; k<row-i ;k++){
                System.out.print(" ");
            }

            for(int j = 0 ; j<=i;j++){
                System.out.print(pattern_arr[i][j]+" ");
            }

            System.out.println();
        }

    }
}
